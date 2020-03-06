package sahdev.study.corejava.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class List_ArrayListEx {
	
	/*
	 * ArrayList is a collection. It is a class which extends AbstractList class and implements List, RandomAccess, Cloneable and Serializable interfaces. 
	 * ArrayList uses dynamic array to store elements.
	 * In this we can store heterogeneous type of data is we don't use generic class during array list creation. After use of generic class we can only use passed type of data.
	 * It allows random access which is through index. We can access array list using index values. 
	 * When we add/remove any element from list it always shift other elements. So it is slower in index based insertion, deletion or update.
	 * It is fast when we traverse any element using index.
	 * It maintain insertion order as per index value.
	 * Allows duplicate values.
	 * ArrayList increments 50% of current array size if the number of elements exceeds from its capacity.
	 */

	public static void main(String[]args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("Sahdev");
		arrayList.add("Dibyajit");
		arrayList.add("Rana");
		arrayList.add("Pattanayak");
		
		Iterator<String> itr = arrayList.iterator();
		while(itr.hasNext()) {
		 System.out.println(itr.next());
		}
		
		arrayList.add(1,"Kumar"); //Add value at index 1 and shift other values by 1.
		System.out.println(arrayList);
		
		arrayList.remove(3); //It will remove third index data.
		System.out.println(arrayList);
		
		arrayList.set(1,"Rana"); //Replace value at index 1 and return previous value of index i.e. Kumar.
		System.out.println(arrayList);
		
		arrayList.addAll(arrayList); //Add passed list at end of the current list and print return statement of addAll i.e. true/false.
		System.out.println(arrayList);
		
		@SuppressWarnings("unchecked")
		ArrayList<String> clonedArrayList =  (ArrayList<String>)arrayList.clone(); //Clone current list and downcast from Object to ArrayList.
		System.out.println(clonedArrayList);
		
		Collections.sort(clonedArrayList); // It will sort passed collection in ascending order.
		System.out.println("Ascending sorted cloned collection: \n"+clonedArrayList);
		
		Collections.reverse(clonedArrayList); // It will sort passed collection in descending order.
		System.out.println("Descending sorted cloned collection: \n"+clonedArrayList);
		
		int lastIndexOfObject = clonedArrayList.lastIndexOf("Rana"); //Return last index of object Rana in cloned array list.
		System.out.println("Last index of passed object: "+lastIndexOfObject);
		
		List<String> subList = clonedArrayList.subList(2,6); //Create a sublist from existing cloned list, from index 2 to 6. 2 is included but 5 is not. 
		System.out.println("Sublist values: "+subList);
		
		ArrayList<String> copyList = new ArrayList<String>(subList); // Sublist return a view so we can not create new Array list from that view. We can create a List from that to iterate. We cannot downcast that also else it will give class cast runtime exception.
		copyList.forEach(p-> System.out.println(p));
		
		ArrayList<String> duplicateList = clonedArrayList;
		duplicateList.forEach(p-> System.out.println(p));
		
		System.out.println("Size of subList: "+subList.size());
		
	}
}
