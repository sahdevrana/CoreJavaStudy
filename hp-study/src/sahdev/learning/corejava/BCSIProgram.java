package sahdev.learning.corejava;
  class BCSIProgram{
    public static void main(String[] args){   
       short a = 1;
       short b=2;
       short c=(short)(a+b); //Here type casting is required because + operator is returning integer type value.
       int d = (short)1 + a; //Here there is no need to change type as integer can take short values.
       //short c=(String)5+'a'; //here it will show an error because string can not be assign to a short type variable.
       System.out.println("Value of c+d : " +c+d);
    }
  }