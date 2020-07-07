package sahdev.learning.corejava;
import java.util.Scanner;
import java.sql.SQLException;   //for sql exception we have to import this class.

class MultipleCatchExReturn{
	
	public static void main(String[] args){
		
		Scanner SC= new Scanner(System.in);
		
		System.out.println("Please enter a integer number");
		
		int i= SC.nextInt();
		
		new MultipleCatchEx().MultipleHandler(i);
		
		//System.out.println(5/i);
		
		System.out.println("After Exception SOP");
	}
	
	
	public int MultipleHandler(int i){
		
		try{    //it will use to get that where exception will ocurse.
			
			//throw new SQLException(); //Here it will be an error because it is an exception and after exception no code in try will execute so below S.O.P will not execute and error will be unreachable error.
			
			System.out.println(5/i);  // in try we will write that statement or cmd for which we know that it can give an exception. 
			
			//return 0;   //Before it if any exceptionis is not occurse or 'catch is not available and there is any exception' and finally is available then that finally will call so it will not return output. If exception occurse then catch will call before it. If no exception and no return from finally then it will be return value of code.
			
			//throw new SQLException(); //it will jump to its catch function for Exception Handling. If catheer for this function will not available then it will show compile time eror.
			
			try{  // with try it is mandatory to use catch or finally any one. Both or multiple catch can be possible.
				throw new SQLException();
				
			//	return 1;   //Before it if any exception is not occurs or 'catch is not available and there is any exception' and finally is available then that finally will call so it will not return output. If exception occurs then catch will call before it.
			}
			
			catch(SQLException SE){  //if this handler will not use then it will show an exception to outer try and then cather with outer try will work as a handeler for that execption.
				
				System.out.println("Dont know the type of erro in sql.");
				return 2;  // it will not return because before it finally will call and that finally will return the value.
				
				//System.exit(0);  //it use to shut down JVM. Now finally will not execute and also SOP in main after this function call.
			}
			
			finally{
				System.out.println("SOP in finally"); //it will execute if excetion will handle then after cath and if catch will not use then it will execute before try cmd and then print exception info of try.
				
				return 3; //it will return the value 3 to outer try and if finally will not hve any return value then it will be the final return value of this function.
			}
		}
		
		catch(ArithmeticException AE){   // it will catch an exception and take that exception object and store that into AE refrence varible of ArithmeticException because exception will be Arithmetic Exception and for that this ArithmeticException class is defined.
			
			//System.out.println("Zero was not to pass here. "+AE.printStackTrace());   //it will show an error at compile time for void type because for void we can not write it in SOP.
			
			System.out.println("Zero was not to pass here. "+AE.toString()); // itt will be that msg which we want to print if that exception will take place.			
			return 3;
		}
		
		catch(Exception E){   // it will use to handle all the exception for which we did not use any catch function because it has all the exception function in its class. So it can use in last of any program. It can not use before any exception cath funtion becaus then it will handle that all exception and that catcher whill will write after this will not reachable and error will unreachable error.
						
			System.out.println("There is an exception here. "+E.toString()); // it will be that msg which we want to print if that exception will take place.			
			return 4;
		}
		
		finally{
			System.out.println("It is a message of finally of outer try.");
			return 5;
		}
		
	}
}
