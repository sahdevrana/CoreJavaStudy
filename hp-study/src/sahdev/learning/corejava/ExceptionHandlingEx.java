package sahdev.learning.corejava;
import java.util.Scanner;

class ExceptionHandlingEx{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter a integer number");
		int i= sc.nextInt();
		new ExceptionHandlingEx().ExceptionHandler(i);
		
		//System.out.println(5/i);
		System.out.println("After Exception SOP");
		sc.close();
	}
	public void ExceptionHandler(int i){
		try{    //it will use to get that where exception will ocurse.
			System.out.println(5/i);  // in try we will write that statement or cmd for which we know that it can give an exception. 
		}
		catch(ArithmeticException AE){   // it will catch an exception and take that exception object and store that into AE refrence varible of ArithmeticException because exception will be Arithmetic Exception and for that this ArithmeticException class is defined.
			
			//System.out.println("Zero was not to pass here. "+AE.toString());   //it will show an error at compile time for void type. For thiss
			
			System.out.println("Zero was not to pass here. "+AE.toString()); // itt will be that msg which we want to print if that exception will take place.			
		}
	}
}

