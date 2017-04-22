public class Ticket implements Comparable {
    
    private int vipLevel;
    private ArrayList keywords;
    private String description;
    private String name;
    private boolean resolved;
    private String solution;
    private int ID;
    
    public Ticket() {
	vipLevel = 0;
	ID = (int) System.currentTimeMillis();
	resolved = false;
    }
    
    public Ticket(int urgency, String prob, String yourName) {
	vipLevel = urgency;
	description = prob;
	name = yourName;
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
    
    public int getVIP {
	return vipLevel;
    }
    
    public String getDesc {
	return description;
    }
    
    public String getName {
	return name;
    }
    
    public boolean getStatus {
	return resolved;
    }
    
    public int getID {
	return ID;
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
