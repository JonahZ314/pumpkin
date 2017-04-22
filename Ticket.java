// Pumpkin
// Marcus Ng, Allan Wang, Joanna Zhou
// APCS2 pd4
// LAB03
// 2017-04-21

import java.util.ArrayList;

public class Ticket implements Comparable {
    
    private int vipLevel;
    private ArrayList keywords;
    private String description;
    private String name;
    private boolean resolved;
    private int ID;
    
    public Ticket(String name) {
	vipLevel = 0;
	keywords = new ArrayList<String>();
	description = "";
	name = "";
	resolved = false;
	ID = (int) System.currentTimeMillis();
    }
    
    public int compareTo(Object hi) {
	Ticket hey = (Ticket) hi;
	if (this.vipLevel > hey.vipLevel) {
	    return 1;
	}
	else if (this.vipLevel < hey.vipLevel) {
	    return -1;
	}
	else {
	    return 0;
	}
    }
    
    public int getVIP() {
	return vipLevel;
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
    
    //add information to problem description
    public void addInfo(String info) {
	description += " " + info;
    }

    // Parse through description for keywords
    public void addKeywords(String description){
	
    }

    // Change status
    public void changeStatus() {
	resolved = !resolved; 
    }
    
    
}
