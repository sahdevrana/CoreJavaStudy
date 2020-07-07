package sahdev.study.corejava.collection;

import java.util.PriorityQueue;

/*
 * Java Queue interface orders the element in FIFO(First In First Out) manner. 
 * In FIFO, first element is removed first and last element is removed at last.
 * 
 * The PriorityQueue class provides the facility of using queue. 
 * But it does not orders the elements in FIFO manner. It inherits AbstractQueue class.
 */
		

public class Queue_PriorityQueue {

	public static void main(String[] args) {
		
	PriorityQueue<String> priorityQueue = new PriorityQueue<String>();
	
	String peekValue = priorityQueue.peek();
	System.out.println("Peek method value when queue is empty: "+peekValue); //It will return null if queue is empty else head element of queue(First added element of queue.) 
	
	priorityQueue.offer("Extra1");
	priorityQueue.offer("Extra2");
	priorityQueue.add("Sahdev");
	priorityQueue.offer("Kumar");
	priorityQueue.add("Rana");
	
	priorityQueue.poll(); //It will retrieves and remove first added element in queue i.e. head of queue.
	priorityQueue.remove(); //It will retrieves and remove first added element in queue  i.e. head of queue.
	priorityQueue.element(); // It will return head element of queue(First added element of queue.).
	
	
	}
}
