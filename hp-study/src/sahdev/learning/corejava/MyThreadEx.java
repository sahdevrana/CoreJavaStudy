package sahdev.learning.corejava;
class MyThread1 extends Thread{  //it is a extends method but in this we can't extends any other class or multiple threading is not allowed.
	public static void main(String [] args){
		MyThread1 me = new MyThread1();
		MyThread1 me1 = new MyThread1();
		
		me.setName("Sahdev"); //Set the thread name, it assign auto but if we want something according to our requirement.
		me1.setName("Rana");
		me.start();  //By this command thread will go in Runnable pool;
		me1.start();
	}
	
	public void run(){  //overriding run function of Thread class but in thread it does not have any body. If we will not overrde it then it  will not show any value because in Thread/Runnable it has no defination.
		if (Thread.currentThread().getName().equals("Sahdev")){   //cmnd before equal will find the name of current thread entering in running pool.
			System.out.println("Hi evryone ME threade has been started.");
		}
		else{
			System.out.println("Hi evryone ME1 threade has been started.");
		}
	}
}