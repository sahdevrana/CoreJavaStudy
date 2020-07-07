package sahdev.study.corejava.multithreading;

public class MultithreadingEx {

	public static void main(String[] args) {
	
		Thread t1 = new Thread(new ThreadWork());
		t1.setName("First thread");
		
		Thread t2 = new Thread(new ThreadWork());
		t2.setName("Second thread");
		
		t1.start();
		t2.start();
	}
}

class ThreadWork implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
	}
	
}
