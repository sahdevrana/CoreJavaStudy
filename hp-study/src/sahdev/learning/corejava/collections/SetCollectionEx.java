package sahdev.learning.corejava.collections;
import java.util.*;

class SetCollectionEx{
	public static void main(String[] args){
		Set HS= new HashSet();  //It will add value in unordered way.
		Bullet B1 = new Bullet("Classic350",125000); 
		Bullet B2 = new Bullet("Classic350",125000);
		Bullet B3 = new Bullet("Classic500",135000);
		Bullet B4 = new Bullet("Classic500 Black",145000);
		HS.add(B1);
		HS.add(B2);
		HS.add(B3);
		HS.add(B4);
		int i=1;
		HS.add(i); 
		HS.add(3);
		System.out.println(HS);
		HS.remove(1);  //it will remove element.
		System.out.println(HS);
		HS.add("Rana");
		System.out.println(HS);
		
	}
	
}

class Bullet{
	String Model;
	int Price;
	Bullet(String Model, int Price){
		this.Model=Model;
		this.Price=Price;
	}
	
	public boolean equals(Object O){   //it will override euals function for bullet class.
		if (O instanceof Bullet ){
			Bullet B = (Bullet)O;
			if(this.Model.equals(B.Model) && this.Price==B.Price){
				return true;
			}
			else{
				return false;
			}
		}
		else {
			return false;
		}
		
	}
	
	public int compareTo(Object O){   //It will override compareTo function. And take an object type value.
		Bullet B = (Bullet)O;
		return this.Model.compareTo(B.Model);  //It will arange elements according to String lenght in accending order. To sort in decending replace this.Model by B.Model;
	}
	
	public String toString(){  //It will override toString function.
		return "Model: "+Model;  
	}
	
	public int hashCode(){  //it will override hashCode so that we can create hashcode of any object according to our recuriement.
		return Model.length();
	}
}