


import java.util.HashSet;
import java.util.Iterator;

public class hashing {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		
        //Add
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(2);
		
		//Delete
		set.remove(4);
		if(!set.contains(1)) {
			System.out.println("does not contain 1 - we deleted 1");
		}
		
		//Search -- contains
		if(set.contains(1)) {
		System.out.println("set contains 1");
	    }
        if(!set.contains(6)) {
        System.out.println("does not contain");	
        }
        
        //size
        System.out.println("size of set is : " + set.size());
        
        //Print all elements
        System.out.println(set);
        
        //Iterator
        Iterator it = set.iterator();
        
        //hasNext, next;
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
        
        
	}
}


