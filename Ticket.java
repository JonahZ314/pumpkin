public class Ticket implements Comparable{
    private int vipLevel;
    private ArrayList keywords;
    private String description;
    private String name;
    private boolean resolved;
    private String solution;
    private int ID;
    public Ticket() {
	vipLevel = 10;
	ID = (int) System.currentTimeMillis();
	resolved = false;
    }
    public Ticket(int urgency, String prob, String yourName){
	vipLevel = urgency;
	description = prob;
	name = yourName;
	resolved = false;
	ID = (int) System.currentTimeMillis();
    }
    public int compareTo(Object hi){
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
    public int getVIP{
	return vipLevel;
    }
    public String getDescrip{
	return description;
    }
    public String getName{
	return name;
    }
    public boolean getStatus{
	return resolved;
    }
    public int getID{
	return ID;
    }
    //add information to problem description
    public void addInfo(String info){
    }
    public void addKeywords(String description){
    }
    public void changeStatus(boolean status){
    }
    
    
}
