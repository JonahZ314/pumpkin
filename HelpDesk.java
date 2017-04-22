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

    public HelpDesk() {
	tickets = new ArrayPriorityQueue<Ticket>();
	problemKeyWords = new ArrayList<String>();
	solutions = new ArrayList<String>();
    }
    
    // Return a solution that contains the keyword
    public String giveSolution(String keyword) {

    }

    public static void main(String[] args) {
	// User creates a ticket
	// Name
	System.out.println("What is your name?");
	String name = Keyboard.readWord();
	Ticket user = new Ticket(name);

	// Problem
	System.out.println("What is your problem?");
	String prob = Keyboard.readWord();
	user.addInfo(prob);

	// Parse problem for keywords

	// Print solution
	System.out.println("Try this: " + "-----");
    }
    
}
