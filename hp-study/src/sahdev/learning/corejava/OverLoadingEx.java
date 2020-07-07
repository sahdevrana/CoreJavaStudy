package sahdev.learning.corejava;
/*class Parent{
	void go(){
		System.out.println("It is printed value of parent class without arguments.");
	}
	
	void go(int a, int b){
		System.out.println("It is printed value of parent class with arguments.");
	}
}

class Child extends Parent{
	void go(){
		System.out.println("It is printed value of child class without arguments.");
	}
	
	void go(int a, int b){
		System.out.println("It is printed value of child class with arguments.");
	}
}

class  OverLoadingEx{
	public static void main(String[] args){
		Parent C= new Child();
		C.go(15,20);
		C=new Child();
		C.go();
	}
}
*/
class ParentInOverloading{
	ParentInOverloading(){
		System.out.println("It is printed value of parent class without arguments.");
	}
	
	ParentInOverloading(int a, int b){
		System.out.println("It is printed value of parent class with arguments.");
	}
}

class ChildInOverloading extends ParentInOverloading{
	ChildInOverloading(){
		System.out.println("It is printed value of child class without arguments.");
	}
	
	ChildInOverloading(int a, int b){
    super(a, b);
		System.out.println("It is printed value of child class with arguments.");
	}
}

class  OverLoadingEx{
	public static void main(String[] args){
		ParentInOverloading C= new ChildInOverloading(15,20);
		C=new ChildInOverloading();
	}
}