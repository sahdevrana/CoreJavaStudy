package sahdev.learning.corejava;
import sahdev.learning.corejava.classes.CalledClassForPackageEx;


  class PackageImportingClass{
	public static void main(String[] args){
 		CallerClass b= new CallerClass();
		b.go();
	} 
  }

  class CallerClass{ //this command will use if members of imported class are public.
  
	void go(){
		CalledClassForPackageEx c= new  CalledClassForPackageEx();  //this command will use if members of imported class are public.

		System.out.println(c.i);

		c.calledFunction();

		System.out.println(c.i);
	}
  }

 /* class CallerClass extends CalledClass{   //this command will use if members of imported class are protected.

	void go(){
		
		System.out.println(super.i);

		super.CalledFunction();

		System.out.println(super.i);
	}
  }*/
