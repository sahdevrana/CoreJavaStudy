package sahdev.study.corejava.collection;

import java.util.HashSet;
import java.util.Iterator;

/*
 * Java HashSet class is used to create a collection that uses a hash table for storage. 
 * It inherits the AbstractSet class and implements Set interface.
 * 
 */
public class Set_HashSet {

	public static void main(String[] args) {
		
		/*
		 * HashSet stores the elements by using a mechanism called hashing.
		 * HashSet does not allow duplicates values means it contains unique elements only.
		 * HashSet allows null value.
		 * HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
		 * HashSet is the best approach for search operations.
		 * The initial default capacity of HashSet is 16, and the load factor is 0.75.
		 */
		
		
		HashSet<String> firstHashSet = new HashSet<String>(); //Empty has set with default capacity & load factor.
		HashSet<String> secondHashSet = new HashSet<String>(20); //Empty has set with 20 capacity & default load factor.
		HashSet<String> thirdHashSet = new HashSet<String>(20,0.60f); //Empty has set with 20 capacity & 60% load factor.
		
		firstHashSet.add("Sahdev Rana");
		
		secondHashSet.add("Sahdev Rana");
		secondHashSet.add("Dibyajit Pattanayak");
		secondHashSet.add("Extra Element");
		
		thirdHashSet.add("Sahdev");
		thirdHashSet.add("Sahdev"); // This is a duplicate value so it will not get store in hash set. It will get rejected.
		thirdHashSet.add("Rana");
		thirdHashSet.add("Dibyajit");
		thirdHashSet.add("Dibyajit"); // This is a duplicate value so it will not get store in hash set. It will get rejected.
		thirdHashSet.add("Pattanayak");
		
		thirdHashSet.size(); //Return number of element as size. It will return int value.
		thirdHashSet.contains("Rana"); //It will return true is passed object is available in set.
		
		secondHashSet.removeAll(firstHashSet); // It will remove all element from second hash set which are available in first has set.
		
		firstHashSet.removeIf(str -> str.contains("Rana")); //Remove on bases of provided condition.
		firstHashSet.remove("Sahdev Rana"); //Remove passes object from set.
		
		secondHashSet.clear(); //It will delete all elements of second hash set.
		secondHashSet.isEmpty(); //Return true of false.
		
		Iterator<String> setItr = thirdHashSet.iterator();
		while (setItr.hasNext()) {
			System.out.println(setItr.next());	
			
		}
		
		

		
		
		
		
		
	}
}
