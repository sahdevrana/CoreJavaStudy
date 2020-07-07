package sahdev.learning.corejava;
class Caller{
   public static void main(String args[]){
      Called c=new Called();
      int valueOfCalled = c.sum(5,7);
      System.out.println("Sum of these two numbers is = "+valueOfCalled);
   }
}

class Called{
  public int sum(int a,int b){
     int s=a+b;
     return s;
  }
}
