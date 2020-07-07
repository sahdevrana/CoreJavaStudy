package sahdev.learning.corejava;
/* In this program I did not use synchronized so it will give different between output of lines because of threade random calling. So we can check that difference when we will run the programme.
*/
class AccountInNonSynchronized{
	private int Balance=10000;
	public int getBalance(){
		return Balance;
	}
	public void setBalance(int Balance){
		 this.Balance=Balance;
	}
}

class  MyThreadEx1 implements Runnable{
	AccountInNonSynchronized AC= new AccountInNonSynchronized();
	
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("Hi "+Thread.currentThread().getName()+", current balance in your account is Rupees: "+AC.getBalance());
			makeWithdraw(100);
			System.out.println("You have withdrawn rupees: 100.");
			System.out.println("Hi "+Thread.currentThread().getName()+", current balance in your account is Rupees: "+AC.getBalance());
		}
			
	}
	
	public void makeWithdraw(int W){
		int Balance=AC.getBalance();
		int CurrentBalance = Balance-W;
		AC.setBalance(CurrentBalance);
	}	
}

 class NoSynchronizedEx{
	 public static void main(String[] args){
		 MyThread1 MT= new MyThread1();
		Thread T1= new Thread(MT);
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