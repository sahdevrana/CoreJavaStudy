package sahdev.learning.corejava;
import java.util.Scanner;

class HasNextEx{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter an integer value");
		if (sc.hasNextInt()){  //this function will work as a condition check. If input value will be int then it will pass it. Has will do it to check that input value is int or not.
			System.out.println("Entered value is an integer value");
		}
		else {
			System.out.println("Entered value is not an integer value");
		}
		sc.close();
	}
}