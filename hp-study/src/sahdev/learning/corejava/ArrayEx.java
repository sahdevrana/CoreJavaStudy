package sahdev.learning.corejava;
import java.util.Scanner;
class Student{
	String Name;
	int Class;
	int Id;
	Student(String Name, int Class, int Id){
		this.Name=Name;
		this.Class=Class;
		this.Id=Id;
	}
	
}


/*
class Marks{
	int Math;
	int Science;
	int English;
	int Hindi;
	Marks(int Math, int Science, int English, int Hindi){
		this.Math=Math;
		this.Science=Science;
		this.English=English;
		this.Hindi=Hindi;
	}
}
*/


class ArrayEx{
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    System.out.println("How many Students do you want to save?");
	    int Size=sc.nextInt();
	    Student[] StuArray= new Student[Size];
		//Student[] StuArray= new Student[]{Sahdev, 5, 25}; // If we know the size of array and then we can declare that arra arguments though this method. There will be no need of user input. There are few other method to set the value in array in PPT and notebook. 
	    for (int i=0; i<Size; i++){
		    System.out.println("Student Name: ");
		    String Name=sc.next();
		    System.out.println("Student Class: ");
		    int Class=sc.nextInt();
		    System.out.println("Student Id: ");
		    int Id=sc.nextInt();
		    Student S=new Student(Name, Class, Id);
		    StuArray[i]=S;
	    }
		System.out.println("Please enter Student Id for which you want to find the record: ");
	    int Id = sc.nextInt();
	    
		int f=0;
		for (int i=0; i< Size ; i++){
			Student S= StuArray[i];
			if (Id==S.Id){
				System.out.println("Student Name: "+S.Name+", Student Class: "+S.Class+ ", Student Id: "+S.Id);
				f=1;
			}
		}
		if (f==0){
			System.out.println("No record found by this Student Id");
		}
		sc.close();
	}
}