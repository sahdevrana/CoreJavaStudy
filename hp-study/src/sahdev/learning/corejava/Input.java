package sahdev.learning.corejava;
import java.util.Scanner;  // scanner is class which we use to take any input for the programme. We have to create its object and can take input as shown below.
class InputParent{
    void  marriage(int a, String b){
      System.out.println("first");
	  
    }
	
	
   public static void main(String... arg){
      InputParent p=new InputParent();
	  Scanner s = new Scanner(System.in);
	  int a= s.nextInt();   //nextInt() : it use to take an integer value as a input. If we will input any other type value then it will show error.
	  String b= s.next();   //next() : it use by default to take an value as a input. It will store that value or take that value in a string form.
	  s.close();
	  p.marriage(a,b);
	  
   }
 }