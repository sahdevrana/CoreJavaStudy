package sahdev.learning.corejava;
import java.util.Scanner;

class Account{
	private int Balance=10000;
	public int getBalance(){ //function to get value of any private vaeiable outside the class by calling this function.
		return Balance;
	}
	public void setBalance(int Balance){ //function to set value of any private vaeiable from outside the class by calling this function.
		 this.Balance=Balance;
	}
}

class  MyThread implements Runnable{
	Account AC= new Account();
	Scanner SC=new Scanner(System.in);
	
	public synchronized void run(){  //Synchronized will make a lock on this function and at a time only that thread which is present in it can use this block of code.
	//public void run(){
		//synchronized(AC){ //By making this also we can use synchronized on anything. It is a block of synchronized and it will lock (Object) this object so that only that thread which is inside synchronized can use this object class no other thread can use it at that time.
			System.out.println("Hi "+Thread.currentThread().getName()+", current balance in your account is Rupees: "+AC.getBalance());
			System.out.println("Please enter the amountyou want to withdraw.");
			int W =SC.nextInt();
			if (W<AC.getBalance()){
				makeWithdraw(W);
				System.out.println("You have withdrawn rupees: "+W);
			}
			else {
				System.out.println("You don't have enough balance.");
			}
		//}		
	}
	
	public void makeWithdraw(int W){
		int Balance=AC.getBalance();
		int CurrentBalance = Balance-W;
		AC.setBalance(CurrentBalance);
	}	
}

 class SynchronizedEx{
	 public static void main(String[] args){
		MyThread MT= new MyThread();  // creating objet for target account. How much object will present that much target or account will available.
		Thread T1= new Thread(MT);  //Passing target to thread by thread constructur.
		Thread T2= new Thread(MT);
		Thread T3= new Thread(MT);
		 
		T1.setName("Sahdev");
		T2.setName("Nakul");
		T3.setName("Yogesh");
		 
		T1.start();
		T2.start();
		T3.start(); 
	 } 
 }  