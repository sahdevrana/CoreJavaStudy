package sahdev.learning.corejava;
import java.util.Scanner;

class UserExceptionEx{
	public static void main(String[] args){
		
		Scanner SC = new Scanner(System.in);
		String Name = SC.next();
		UserExceptionEx UE= new UserExceptionEx();
		UE.Sahdev(Name);
	}
	
	public void Sahdev(String Name){
		if (Name.equals("Sahdev")){  // euals will compare character of input name to given hard coded String name "Sahdev".
			try{
				throw new UserException();  //it will throw an object of exception in this method.  
			}
			
			catch (UserException U){  //It will handle exception.
				System.out.println("Please  do not enter this name. He is the owner of this programme.");
			}
		}
		else {
			System.out.println("You have entered a name "+Name);
		}
	}
	
}

class UserException extends Exception{  //it is a exception created  by user. It extends to Exception so it becomes a exceptin.
	public String toString(){        //It is a method to override a toString method of Exception class.
		return "Exception";
	}
}
