package sahdev.learning.corejava;
 import java.util.Scanner;  // scanner is class which we use to take any input for the programme. We have to create its object and can take input as shown below.
 class JobForm{
	 String Name;
	 String Knowledge;
	 int Experience;
	 Address Ad;
	 
	 JobForm(String Name, String Knowledge, int Experience, Address Ad){
		 this.Name=Name;
		 this.Knowledge=Knowledge;
		 this.Experience=Experience;
		 this.Ad=Ad;
		 
	 }
		  
    }
	
 class Address{
	 
	 String Country;
	 String State;
	 String Area;
	 String HouseNo;
	 int Pincode;
	 
	 Address(String Country, String State, String Area, String HouseNo, int Pincode){
		 this.Country=Country;
		 this.State=State;
		 this.Area=Area;
		 this.HouseNo=HouseNo;
		 this.Pincode=Pincode;
	 }
	 
 }
 
 
 
 class RelationShipHas{   //it is an example of "has a" relationship.
	
	public static void main(String[] arg){
		Scanner S=new Scanner(System.in);
		System.out.println("Please Enter Your Name:");
		String Name=S.next();
		System.out.println("Please Enter Your Knowledge:");
		String Knowledge=S.next();
		System.out.println("Please Enter Your Experience:");
		int Experience=S.nextInt();
		System.out.println("Please Enter Your Country Name:");
		String Country=S.next();
		System.out.println("Please Enter Your State Name:");
		String State=S.next();
		System.out.println("Please Enter Your Area Name:");
		String Area=S.next();
		System.out.println("Please Enter Your HouseNo:");
		String HouseNo=S.next();
		System.out.println("Please Enter Your Pincode:");
		int Pincode=S.nextInt();
		
		Address Ad=new Address(Country, State, Area, HouseNo, Pincode);
		
		JobForm JF=new JobForm(Name, Knowledge, Experience, Ad);
		
		
		System.out.println("Information of student is given below: ");
		System.out.println("Name: "+JF.Name+ " Knowledge: "+JF.Knowledge+  " Experience: "+JF.Experience+  " Address Pincode: "+JF.Ad.Pincode);
		
   }
 }