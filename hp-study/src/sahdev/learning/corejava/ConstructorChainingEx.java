package sahdev.learning.corejava;
  class Parent{ 
     int Age;
     String Name;
     
     // In this example there is overloading because there are a change in parameter list or argument list.
	 // In this example there is Constructor Chaining also because one constructor is calling to second constructor and second is calling to third constructor and this is known as constructor chaining.
     Parent(int Age, String Name){
       this(Name); //this();
        this.Age=Age;
        System.out.println(", Parent Age: "+this.Age);
     }
    Parent(String Name){
        this.Name=Name;
        System.out.print("Parent Name: "+this.Name);
     }
  }

 class Child extends Parent{ 
     int Age;
     String Name;
     
     Child(int Age, String Name){
        this(Name); // or super() should add if I will not call other constructor of this class where I am calling super class constructor. 
        this.Age=Age;
        System.out.println(", Child Age: "+this.Age);
     }
    Child(String Name){
        super(50, "Mohan");
        this.Name=Name;
        System.out.print("Child Name: "+this.Name);
     }

  }

  class ConstructorChainingEx{
     public static void main(String[] args){
        Child c=new Child(21, "Nakul");
        System.out.println(c.Age);
        
     }
  }