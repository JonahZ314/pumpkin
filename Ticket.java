// Pumpkin
// Marcus Ng, Allan Wang, Joanna Zhou
// APCS2 pd4
// LAB03
// 2017-04-21

import java.util.ArrayList;

public class Ticket implements Comparable<Ticket> {

    private int vipLevel;
    private ArrayList<String> keywords;
    private String description;
    private String name;
    private boolean resolved;
    private int ID;
    private static int prevID = 0;
    
  /*Possible keywords
      "turn", "slow",
      "internet", "printer"
    */



    public Ticket(String newName, String desc, int level) {
	vipLevel = level;
	keywords = new ArrayList<String>();
	description = desc;
	name = newName;;
	resolved = false;
	ID = prevID;
	prevID++;
    }

    public int compareTo(Ticket other) {
	if (this.vipLevel > other.vipLevel) {
	    return 1;
	}
	else if (this.vipLevel < other.vipLevel) {
	    return -1;
	}
	else {
	    return 0;
	}
    }

    public int getVIP() {
	return vipLevel;
    }

    public ArrayList<String> getKeyWords() {
	return keywords;
    }
    
    public String getDesc() {
	return description;
    }

    public String getName() {
	return name;
    }

    public boolean getStatus() {
	return resolved;
    }

    public int getID() {
	return ID;
    }

    // Set vipLevel
    public void setVIP(int level) {
	vipLevel = level;
    }

    // Change status
    public void changeStatus() {
	resolved = !resolved;
    }
    
    //add information to problem description
    public void addInfo(String info) {
	description += " " + info;
    }

    // Parse through description for keywords
    public void addKeywords(String description){
	String[] a = description.split(" ");
	for (int i = 0; i < a.length; i++){
	    if (a[i].equals("turn") ||
		a[i].equals("slow") ||
		a[i].equals("internet") ||
		a[i].equals("printer")) {
		keywords.add(a[i]);
	    }
	}
    }

    // ToString
    public String toString() {
	String ret = "";
	ret += "------Ticket------" + "\n";
	ret += "ID: " + ID + "\n";
	ret += "Name: " + name + "\n";
	ret += "VIP Level: " + vipLevel + "\n";
	ret += "Solved: " + resolved + "\n";
	ret += "Problem: " + description + "\n";
	return ret;
    }

}
