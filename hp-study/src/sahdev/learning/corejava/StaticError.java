package sahdev.learning.corejava; 
 class StaticError{

    static int i=5; //If we will use this then it will not show error and print value of i.

    //int i=5;

    public static void main (String[] args){

   /* StaticError E= new StaticError();

      E.go(); */    //these two line statement can use if go function will not assign as a non static function.

      go();       //these statement will show error if go function will be non static.

      System.out.println(i); //Here if i will show error if it  will not mark as a static function.

    } 
    public static void go(){

    //public void go(){   //if we will use this statement then error will show. Non static members can not call from static members.

      i=3;
    }
 }