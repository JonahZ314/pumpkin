// Pumpkin
// Marcus Ng, Allan Wang, Joanna Zhou
// APCS2 pd4
// LAB03
// 2017-04-21

import java.util.ArrayList;

public class ArrayPriorityQueue<T> implements PriorityQueue<T> {

    private ArrayList<T> _data;

    // Constructor
    public ArrayPriorityQueue() {
	_data = new ArrayList<T>();
    }

    // Enqueue value
    public void add(T x) {
	// If arraylist is empty or x is the lowest new value
	if (isEmpty() || ((Comparable)x).compareTo((Comparable)_data.get(_data.size() - 1)) < 0) {
	    _data.add(x);
	}
	// If value is greater or equal to the value at index i, then add value current index
	else {
	    for (int i = 0; i < _data.size(); i++) {
		if (((Comparable)x).compareTo((Comparable)_data.get(i)) > -1) {
		    _data.add(i, x);
		    return;
		}
	    }
	}
    }

    // Check if size is 0
    public boolean isEmpty() {
	return _data.size() == 0;
    }

    // Return the smallest value (last index)
    public T peekMin() {
	return _data.get(_data.size() - 1);
    }

    // Dequeue the smallest value (last index)
    public T removeMin() {
	return _data.remove(_data.size() - 1);
    }

    // Print arraylist with spaces
    public String toString() {
	String ret = "";
	for (T each : _data) {
	    ret += each + " ";
	}
	return ret;
    }
    
    public static void main(String[] args) {
	
	ArrayPriorityQueue<Integer> a = new ArrayPriorityQueue<Integer>();

	System.out.println(a.isEmpty()); // true
	
	a.add(0); // 0
	a.add(5); // 5 0
	a.add(2); // 5 2 0
	a.add(1); // 5 2 1 0
	a.add(3); // 5 3 2 1 0
	a.add(4); // 5 4 3 2 1 0

	System.out.println(a); // 5 4 3 2 1 0

	System.out.println(a.peekMin()); // 0
	System.out.println(a.removeMin()); // 0
	System.out.println(a); // 5 4 3 2 1
	
	System.out.println(a.peekMin()); // 1
	System.out.println(a.removeMin()); // 1
	System.out.println(a); // 5 4 3 2
	
	System.out.println(a.peekMin()); // 2
	System.out.println(a.removeMin()); // 2
	System.out.println(a); // 5 4 3
	
	System.out.println(a.peekMin()); // 3
	System.out.println(a.removeMin()); // 3
	System.out.println(a); // 5 4
	
	System.out.println(a.peekMin()); // 4
	System.out.println(a.removeMin()); // 4
	System.out.println(a); // 5
	
	System.out.println(a.peekMin()); // 5
	System.out.println(a.removeMin()); // 5
	System.out.println(a); //
	

	//ArrayPriorityQueue<Ticket> b = new ArrayPriorityQueue<Ticket>();
    }
    
}
