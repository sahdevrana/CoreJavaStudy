package sahdev.study.corejava.collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Deque_LinkedList {
	

	/*
	 * It is same as LnkedList and all commands are same.
	 * It has these methods from deque rest are from list. 
	 * 1. offer, offerLast, offerFirst
	 * 2. poll, pollFirst, pollLast
	 * 3. remove, removeFirst, removeLast
	 * 4. peek, peekFirst, peekLast, element
	 * 
	 * 
	 */

		/*
		 * LinkedList is a collection. It is a class which extends AbstractSequentialList class and implements List, Deque, RandomAccess, Cloneable and Serializable interfaces. 
		 * Java LinkedList class uses a doubly linked list to store the elements.
		 * In this we can store heterogeneous type of data is we don't use generic class during Linked list creation. After use of generic class we can only use passed type of data.
		 * It allows random access which is through index. We can access linked list using index values. 
		 * When we manipulate linked list it is faster as compare to ArrayList as there is no need to shift values. It will add new element memory address into previous element.
		 * It maintain insertion order as per index value.
		 * Allows duplicate values.
		 * In doubly linked list we can add or remove elements from both sides.
		 */
		public static void main(String[] args) {
			
		
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("Sahdev");
		linkedList.add("Dibyajit");
		linkedList.add("Rana");
		linkedList.add("Pattanayak");
		
		Iterator<String> itr = linkedList.iterator();
		while(itr.hasNext()) {
		 System.out.println(itr.next());
		}
		
		
		
		linkedList.addFirst("Starting"); //Adding object in starting of linked list. Return type is void.
		linkedList.addLast("EndList"); //Adding object in end of linked list. Return type is void.
		
		linkedList.getFirst(); // Return first element of linked list. Return type is E.
		linkedList.getLast(); // Return last element of linked list. Return type is E.
		
		Iterator<String> descItr = linkedList.descendingIterator(); // Return descending iterator to traverse list backward.
		
		while(descItr.hasNext()) { // It will start checking from last and check till first element of linked list.
			System.out.println(descItr.next()); //It will start cursor from end and traverse till starting.
		}
		
		
		System.out.println(linkedList.peek());  //It will retrieves first element of linked list but does not remove
		
		System.out.println("Peek first element: "+linkedList.peekFirst()); //It will retrieves first element of linked list but does not remove.
		System.out.println("Peek last element: "+linkedList.peekLast()); //It will retrieves last element of linked list but does not remove.
		
		 //These 3 poll methods are Deque methods.
		System.out.println("Poll element: "+linkedList.poll()); //It will retrieves & remove first element of linked list.
		System.out.println("Poll first element: "+linkedList.pollFirst()); //It will retrieves & remove first element of linked list.
		System.out.println("Poll last element: "+linkedList.pollLast()); //It will retrieves & remove last element of linked list.
		
		System.out.println("Offer element to add in List. On sucess retrun true.");
		linkedList.offer("Offer"); //It will add element in the end of list. This is Deque method.
		
		System.out.println("Offer element to add as first element of List:");
		linkedList.offerFirst("Sahdev"); //It will add element in starting of list. This is Deque method.
		
		System.out.println("Offer element to add as first element of List:");
		linkedList.offerLast("List ended"); //It will add element in the end of list. This is Deque method.
		
		
		linkedList.push("Stack push"); //It pushes an element onto the stack represented by a list. It will add as a first element.
		System.out.println(linkedList);
		
		System.out.println("Pop stack element presented by linked list: "+linkedList.pop()); //It will remove element of stack/linked list. It will remove first element.
		
		
		//Below methods are working same as Array List
		 
		linkedList.add(1,"Kumar"); //Add value at index 1 and shift other values by 1.
		System.out.println(linkedList);
		
		linkedList.remove(3); //It will remove third index data.
		System.out.println(linkedList);
		
		linkedList.set(1,"Rana"); //Replace value at index 1 and return previous value of index i.e. Kumar.
		System.out.println(linkedList);
		
		linkedList.addAll(linkedList); //Add passed list at end of the current list and print return statement of addAll i.e. true/false.
		System.out.println(linkedList);
		
		@SuppressWarnings("unchecked")
		LinkedList<String> clonedLinkedList =  (LinkedList<String>)linkedList.clone(); //Clone current list and downcast from Object to ArrayList.
		System.out.println(clonedLinkedList);
		
		Collections.sort(clonedLinkedList); // It will sort passed collection in ascending order.
		System.out.println("Ascending sorted cloned collection: \n"+clonedLinkedList);
		
		Collections.reverse(clonedLinkedList); // It will sort passed collection in descending order.
		System.out.println("Descending sorted cloned collection: \n"+clonedLinkedList);
		
		int lastIndexOfObject = clonedLinkedList.lastIndexOf("Rana"); //Return last index of object Rana in cloned linked list.
		System.out.println("Last index of passed object: "+lastIndexOfObject);
		
		List<String> subList = clonedLinkedList.subList(2,6); //Create a sublist from existing cloned list, from index 2 to 6. 2 is included but 5 is not. 
		System.out.println("Sublist values: "+subList);
		
		System.out.println("Size of subList: "+subList.size());

	}
	

}
