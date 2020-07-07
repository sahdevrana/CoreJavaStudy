package sahdev.study.corejava.collection;

import java.util.ArrayDeque;

/*
 * Java Deque Interface is a linear collection that supports element insertion and removal at both ends. 
 * Deque is an acronym for "double ended queue".
 * 
 * 
 * The ArrayDeque class provides the facility of using deque and resizeable-array. 
 * It inherits AbstractCollection class and implements the Deque interface.
 */

public class Deque_ArrayDeque {

	/*
	 * Unlike Queue, we can add or remove elements from both sides.
	 * Null elements are not allowed in the ArrayDeque.
	 * ArrayDeque has no capacity restrictions.
	 * ArrayDeque is faster than LinkedList and Stack.
	 * 
	 * Does not maintain any order.
	 * We can iterate it in descending order also by using desending iterator.
	 */

	public static void main(String[] args) {
		ArrayDeque<String> arrayDeque = new ArrayDeque<String>();

		String peekValue = arrayDeque.peek();
		System.out.println("Peek method value when queue is empty: "+peekValue); //It will return null if queue is empty else head element of queue(First added element of queue.) 

		arrayDeque.offer("Extra1");
		arrayDeque.offerLast("Extra2");
		arrayDeque.add("Sahdev");
		arrayDeque.offer("Kumar");
		arrayDeque.add("Rana");
		arrayDeque.offerFirst("ExtraFirst");

		String peekFirstValue = arrayDeque.peekFirst();
		System.out.println("Peek first method value: "+peekFirstValue); //It will return null if queue is empty else head element of queue(First added element of queue.) 
		String peekLastValue = arrayDeque.peekLast();
		System.out.println("Peek last method value: "+peekLastValue); //It will return null if queue is empty else tail/last element of queue(last added element of queue.) 

		arrayDeque.poll(); //It will retrieves and remove first added element in queue i.e. head of queue.
		arrayDeque.pollFirst();
		arrayDeque.pollLast();
		arrayDeque.remove(); //It will retrieves and remove first added element in queue  i.e. head of queue.
		arrayDeque.removeFirst();
		arrayDeque.removeLast();
		arrayDeque.element(); // It will return head element of queue(First added element of queue.).

		for(String s:arrayDeque){  
			System.out.println(s);  
		}  

	}
}
