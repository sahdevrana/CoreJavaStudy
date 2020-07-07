package sahdev.study.corejava.collection;
import java.util.Vector;
import java.util.Enumeration;

public class List_VectorEx {

	 /*
	  * Vector is synchronized.
	  * Vector increments 100% means doubles the array size if the total number of elements exceeds than its capacity.
	  * Vector is slow because it is synchronized, i.e., in a multi-threading environment, it holds the other threads in runnable or non-runnable state until current thread releases the lock of the object.
	  * A Vector can use the Iterator interface or Enumeration interface to traverse the elements.
	  */	
  
		 public static void main(String args[]){      
		  Vector<String> vector=new Vector<String>();//creating vector  
		  vector.add("umesh");//method of Collection  
		  vector.addElement("irfan");//method of Vector  
		  vector.addElement("kumar");  
		  
		  //traversing elements using Enumeration  
		  Enumeration<String> e=vector.elements();  
		  while(e.hasMoreElements()){  
		   System.out.println(e.nextElement());  
		  }  
		 }  
}
