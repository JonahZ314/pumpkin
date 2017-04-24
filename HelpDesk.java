// Pumpkin
// Marcus Ng, Allan Wang, Joanna Zhou
// APCS2 pd4
// LAB03
// 2017-04-21

import java.util.ArrayList;
import cs1.Keyboard;

public class HelpDesk {

    private static ArrayPriorityQueue<Ticket> tickets = new ArrayPriorityQueue<Ticket>();
    
    // Return a solutions based on the keywords
    public static String giveSolution(ArrayList<String> keywords) {
	String solutions = "Please try these possible solutions:\n";
	if (!keywords.isEmpty()) {
	    for (String s: keywords) {
		if (s.equals("turn")) {
		    solutions += "- Make sure the power supply is on\n";
		    solutions += "- Plug your computer into a working wall socket\n";
		    solutions += "- Try using AC power instead of the main battery\n";
		} else if (s.equals("slow")) {
		    solutions += "- Try uninstalling unnecessary programs\n";
		    solutions += "- Try cleaning your disk\n";
		    solutions += "- Try disabling programs that launch on startup\n";
		} else if (s.equals("internet")) {
		    solutions += "- Try using an ethernet cable\n";
		    solutions += "- Try restarting your modem\n";
		    solutions += "- Try restarting your router\n";
		} else if (s.equals("printer")) {
		    solutions += "- Try connecting your printer to your computer with a USB cable\n";
		    solutions += "- Try downloading the drivers for your specific printer\n";
		    solutions += "- Try buying a new printer\n";
		}
	    }
	} else {
	    solutions = "No solutions found :(\n";
	}		 
	return solutions;
    }

    public static void main(String[] args) {
	while (true) {
	    // User creates a ticket
	    // Name
	    System.out.println("==========WELCOME TO THE HELP DESK==========");
	    System.out.println("What is your name?");
	    String name = Keyboard.readWord();
	
	    // VIP Level
	    System.out.println("\nHow important are you, " + name + "? Enter a number...(lower has higher priority)");
	    int vip = Keyboard.readInt();
	    
	    // Problem
	    System.out.println("\nWhat is your problem?");
	    String prob = Keyboard.readString() + "\n";
	    Ticket user = new Ticket(name, prob, vip);
	    tickets.add(user);
	    
	    // Add keywords
	    user.addKeywords(user.getDesc());
	    
	    // Print ticket
	    System.out.println(user + "\n");
	    
	    // While problem is not solved
	    while (!user.getStatus()) {
		// Print solutions
		System.out.println(giveSolution(user.getKeyWords()));
		
		// Solved?
		System.out.println("Is your problem solved? ('yes' or 'no')");
		String response = Keyboard.readWord();
		if (response.equals("yes")) {
		    user.changeStatus();
		    //Dequeue
		    tickets.removeMin();
		System.out.println("Yay! Your problem is fixed!\n\n");
		} else if (response.equals("no")) {
		    System.out.println("\nSorry, we do not know the solution to your problem. You are still in queue. Please wait while we get a representative to help you.\n");
		    break;
		}
	    }
	}
    }
    
}
