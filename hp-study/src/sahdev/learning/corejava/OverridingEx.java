package sahdev.learning.corejava;
class ParentInOverriding{
	public void marrige(){     //it is a overridden method because this method will be override.
		System.out.println("Only arrange marrige allow.");
	}
}

class ChildInOverriding extends ParentInOverriding{
	public void marrige(){      //it is a overriding command because it is following all the rules and overriding parents marriage method according to his.
		System.out.println("My prefrence is Love marrige.");
	}
}

class OverridingEx{
	public static void main(String[] args){
		//Parent P= new Parent(); //If this command will use at the place of polymorphisam then parent class method will call because its object will create.
		
		ChildInOverriding P= new ChildInOverriding();
		/* Above function is Polymorphisam. In polymorphisam Superclass can hold subclass while vice versa is not possible.
		In this case child method marriage will call because object of subclass is created hence its function will accessible.
		Polymorphisam :--
		SuperClass-->Reference variable = new SubClass object; By this command Subclass object will create in  reference variable.
		*/
		
		P.marrige();     //Here child's method marriage will call because object of subclass is created hence its function will accessable.
		
	}
}