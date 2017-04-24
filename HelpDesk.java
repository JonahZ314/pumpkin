// Pumpkin
// Marcus Ng, Allan Wang, Joanna Zhou
// APCS2 pd4
// LAB03
// 2017-04-21

import java.util.ArrayList;
import cs1.Keyboard;

public class HelpDesk {

    private ArrayPriorityQueue<Ticket> tickets;
    private ArrayList<String> problemKeyWords;
    private ArrayList<String> solutions;
    
    // Return a solution that contains the keyword
    public String giveSolution(String keyword) {
	return "";
    }

    public static void main(String[] args) {

	// User creates a ticket
	// Name
	System.out.println("What is your name?");
	String name = Keyboard.readWord();
	
	// VIP Level
	System.out.println("How important are you, " + name + "? Enter a number...(lower has higher priority)");
	int vip = Keyboard.readInt();

	// Problem
	System.out.println("What is your problem?");
	String prob = Keyboard.readWord();
	Ticket user = new Ticket(name, prob, vip);

	// Parse problem for keywords
	//user.addKeywords();

	// Print solution
	System.out.println("Try this: " + "-----");
    }
    
}
