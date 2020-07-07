package sahdev.learning.corejava;
//package clas.hpes;
//import classes.hp.HelloPackage;
//import classes.hp.*;  //it use to import whole package's classes.
class Test{

  /*
**this static block will call when class test will start to load. This will call before any initialization in this class.**
*/
  static{
    System.out.println("inside Test static block");
  }
  
/*
**this non-static block will call when any constructor of class test will start to load. This will call before initialization of constructor in this class. This will call every time for this class if we will call any constructur of this class from any other class.**
*/
  {
    System.out.println("inside Test non static block");
  }
  Test(){
  
     System.out.println("inside Test without arg cons");
   }
  Test(int a){
     
     System.out.println("inside Test with arg cons");
  }
}

class B extends Test{

     /*
     **this static block will call when class B will start to load. This will call before any initialization in this class.**
     */
  
    static{
       System.out.println("inside B static block");
    }

    /*
    **this non-static block will call when any constructor of class B will start to load. This will call before initialization of constructor in this class.  **
    */
    {
      System.out.println("inside B non static block");
    }

   B(int x){
      System.out.println("inside B with args cons");
   }

   public static void main(String[] args){
     B b=new B(5);
     Test t=new Test(5);
    /* HelloPackage h=new HelloPackage();
     h.display();*/
   }
 
}