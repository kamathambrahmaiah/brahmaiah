package JavaCollections;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetPractice {
	public static void main(String [] args) {
	  //HashSet - > HashMap - > Array of nodes(Keys, Values)
	  //Set<Integer> hs = new HashSet<>();
	 /*	HashSet<Integer>hs = new  HashSet<>();         ****** It Doesn't Maintain Insertion order
		
		hs.add(10);
		hs.add(35);
		hs.add(75);
		hs.add(null);
		hs.add(45);
		hs.add(55);
		hs.add(35);
		hs.add(10);
		hs.add(null);
		
		System.out.println(hs);
		
		System.out.println(hs.contains(10));
		
		hs.remove(10);
		
		System.out.println(hs);
		  
	}

}*/
		
		
		
		
		
	 //LinkedHashSet  -> LinkedHashMap  ->  Link of nodes
	// Set <Integer> lhs = new LinkedHashSet<>();              //******It Maintain Insertion Order  
    /* LinkedHashSet<Integer>hs = new  LinkedHashSet<>();
		
		hs.add(10);
		hs.add(35);
		hs.add(75);
		hs.add(null);
		hs.add(45);
		hs.add(55);
		hs.add(35);
		hs.add(10);
		hs.add(null);
		
		System.out.println(hs);
		
		System.out.println(hs.contains(10));
		
		hs.remove(10);
		
		System.out.println(hs);
		
	}
	
}*/
		
		
		// TreeSet - > TreeMap  -> 
		//Set <Integer> ts = new TreeSet<>();        ***** It Maintain Ascending Order
		TreeSet<Integer> ts = new TreeSet<>();
		
		ts.add(10);
		ts.add(35);
		ts.add(75);
		ts.add(45);
		ts.add(55);
		ts.add(35);
		ts.add(10);
		
		
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.pollFirst());
		System.out.println(ts.pollLast());
		System.out.println(ts);
		
		
		
	}
}
		
		




     
