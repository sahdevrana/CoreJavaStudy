package sahdev.learning.corejava;

class MyThreadEx implements Runnable{
	
	static Thread T1;
	static Thread T2;
	static Thread T3;
	
	public static void main(String [] args){
		MyThreadEx ME= new MyThreadEx();
		 T1= new Thread(ME);
		 T2= new Thread(ME);
		 T3= new Thread(ME);
		T1.setName("Sahdev");
		T2.setName("Kumar");
		T3.setName("Rana");
		
		System.out.println(Thread.MAX_PRIORITY);  //It will use to get the maximum priority of JVM.
		System.out.println(Thread.MIN_PRIORITY);  //Min priority.
		System.out.println(Thread.NORM_PRIORITY); //Normal priority.
		
		T1.setPriority(10);  //It will set priority but still it is not garuntee tha it will run again but ssome time it can give a chance but no guarntee.
		T2.setPriority(5);
		T3.setPriority(1);
		
		T1.start();
		T2.start();
		T3.start();
		
		for(int i=0;i<=5;i++){  //main is also a thread and it can also work as a thread.
			
			System.out.println(Thread.currentThread().getName()+" have the value of i: " +i);
			
		}
	}
	
	
	public void run(){
		
		for(int i=0;i<=5;i++){
			
			if(Thread.currentThread().getName().equals("Sahdev")){
				
				T1.yield();  //It will give a chance to other one. When this will call then it will not run and go back to runable pool and whenever it will call to run then it will resume after here.
				System.out.println(Thread.currentThread().getName()+" have the value of i: " +i);
			}
			
			else{
				if (Thread.currentThread().getName().equals("Kumar")){
					try{
						T2.sleep(1000); // It will execute and this thread will go in sleep pool for 1000 nano seconds. Sleep will take  nano seconds values. Every time whenever it will execute then go for sleep and whenever it will come in runniing pool then it will resume from here.
					}
					catch(InterruptedException IE){
						System.out.println("Sleep cmd is not working properly.");
					}
					System.out.println(Thread.currentThread().getName()+" have the value of i: " +i);
				}
				else{
					if (Thread.currentThread().getName().equals("Rana")){
						try{
							T2.join(); // By thhs join command T3 will join T2 thread means T3 will run after complition of T2 and it have gurantee. 
						}
						catch(InterruptedException IE){
							System.out.println("Sleep cmd is not working properly.");
						}
						System.out.println(Thread.currentThread().getName()+" have the value of i: " +i);
					}
					else{
						System.out.println(Thread.currentThread().getName()+" have the value of i: " +i);
					}
				}	
			}
		}		 
	}
}



	 
