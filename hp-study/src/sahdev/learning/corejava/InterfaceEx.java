package sahdev.learning.corejava;
interface Animal{    
	
	void MakeSound();  // in interfacee there will be no need to write abstract before data type.
	
	void LivingPlace();
	
	/*void Eat(){       // we  cant give defination of any funnction in interface. So it will show error here.
		System.out.println("Every animal eat to live fit and healhy.");
	}*/
}

interface Pet extends Animal{  //Here interface extends Pet interface. Multiple interface can extends in subinterface.
	void Behaviour();
}


abstract class Dog implements Animal{  // In any abstract classs we can implement any interface. Multiple interface is allow to implemet in single class or multilevel interface can be done as meentioned below. 
	
	public void MakeSound(){
		System.out.println("Dogs maake a sound of Bhow Bhow");
	}
	
	abstract public void LivingPlace();  //here public is mandatory because in interface every member is public so we can not override by weaker function.
}

class Labra extends Dog implements Pet{    // In a single class implement and extends both can done. Now we can access and override all abstract function and also can call class function. 

    /*  In this if i want to call all function of parent and child then I have to implement chhild here or in Labra's superclass. 
	And then I can make aan object of this class through super interface refrence variable. As I doone in main funcion.*/

	public void LivingPlace(){
		System.out.println("Labra dog is a pet animal and live at home.");
	}
	
	public void Behaviour(){
		System.out.println("Labra behaviou is so mindfull and look so cute also.");
	}
}

class Cat implements Pet{ // This have to give an defination of its implement's interface and also implemented interface's superclass. Else it will show an error else we have to make this class abtract.
	
	public void MakeSound(){
		System.out.println("Cat make a sound of Mew Mew");
	}
	
	public void LivingPlace(){
		System.out.println("Cat live in a hidden place so that no one can see her.");
	}
	
	public void Behaviour(){
		System.out.println("Cat behaviou is so mindfull and look so cute also.");
	}
}

class InterfaceEx{
	public  static void main(String[] args){
		//Animal A=new Labra();  // by this object we can only call abstract function overridden of Animal interface Or can make a call of new assigned function in of object class.
		Pet B=new Labra();	// By this object we can call any override funcion of super and sub interface. As happening in this example and also called in below line of cat class function calling.
		B.MakeSound();  
		B.LivingPlace();
		B.Behaviour();
		
	/*	//A.Behaviour();   // We cant call this because we did not implements Pet in Labra or Dog. So if we will write this cmd then there will be an error of variable not found.
		*/
		B=new Cat();
        B.MakeSound();
		B.LivingPlace();
		B.Behaviour();
	}
}