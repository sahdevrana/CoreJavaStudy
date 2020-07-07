package sahdev.learning.corejava.collections;
import java.util.*;

class ListCollectionEx{
	public static void main(String[] args){
		ArrayList AL= new ArrayList();
		int i=1;
		AL.add(i);  //Here auboxig xomes in role. It can done after ver 1.4 of jdk because it take only object type value. By autoboxing it will auto convert in object by Integer.
		AL.add(new DogClassInList());
		AL.add(3.4);  //Here and in second upper line we are passing primitive values which are not allowed  but because of autoboxing no error will show but warning will show in compile time.
		System.out.println(AL);
		AL.remove(1);  //it will remove the value of index 1. If  we will pass object to remove then it will remove the element of that object.ex: new Dog() then it will remove thatt object.
		System.out.println(AL);
		AL.add(1,"Rana");  //use to add the element at the given index.(index,E). Valuees will shift right side from 1 index and at 1 index it will add.
		System.out.println(AL);
		AL.set(2,i);  // It will replace the value of 2nd index by element i.
		System.out.println(AL);
		AL.addAll(1,AL); //it will add all elements of AL ArrayList at index 1 and shift every value from index 1 to just right.
		System.out.println(AL);
		
		
		Iterator IT= AL.iterator();  //It use to iterate all the values of list. It will store values in IT one by one
		while(IT.hasNext()){
			Object O= IT.next();
			if (O instanceof String){  
				String S= (String)O;
				System.out.println(S.length());
			}
			else {
				System.out.println(O);
			}
		}
		
		
		Object [] AY= AL.toArray();  //toArray will convert List into array.
		System.out.println(AL);
	}
}

class DogClassInList{
	
}