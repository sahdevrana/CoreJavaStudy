package sahdev.learning.corejava.classes;
class Called{
	String Name= "Sahdev";
	
	public static void main(String[] args){
		
		//Example 1.
		final Called C= new Called();
		C.Name="Rohit";		
		System.out.println("Output of called class from final object "+C.Name);
		//C= new Called(); //it will show error becaue here we cant assign a new value for final refrence variable C.
		
		//Example 2.
		final int i= 5;
		//i= 6;  //here it will show an error because we cannot assign any value to a final variable.
		System.out.println("Value of I :" +i);
		
	}
}