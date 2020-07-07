package sahdev.learning.corejava.abstracts;

abstract class Animal{    // If a single function or member is abstract in a class then we must assigned that class abstract. 
	abstract void MakeSound(); // If  we marked abstract any function then we cant give it defination. If we will give its defination then it cannot abstract.
	abstract void LivingPlace();
	void Eat(){
		System.out.println("Every animal eat to live fit and healhy.");
	}
}

abstract class Dog extends Animal{   //This class is assigned as abstract because in this class there is an abstract function.
	/*Dog(){
		Super();  //this super will call automatically for Animal class as per constructor rule. If we want to call any constructor in Superclass then we can define constructor in super class with arguments or without according to choice through this subclass constructor.
	};*/

	
	void MakeSound(){
		System.out.println("Dogs make a sound of Bhow Bhow");
	}
	
	abstract void LivingPlace(); //This function is marked as abstract because I dont want to give defination of this function in this class or I can say different dogs live in diffrent place so I will define it in sub class of dog. 
}

class Labra extends Dog{    // In a subclass it is mandatory to define the abstract function of super class.
    /*Labra(){
		Super();  //this super will call automatically for Dog class as per constructor rule. If we want to call any constructor in Superclass then we can define constructor in super class with arguments or without according to choice through this subclass constructor.
	};*/
	
	/*void MakeSound(){         // If we want to override this function again then we can wrie it here else there will be no need to write it again. We can call it by child refrence variable.
		System.out.println("Dogs maake a sound of Bhow Bhow");
	}*/
	
	void LivingPlace(){
		System.out.println("Labra dog is a pet animal and live at home.");
	}
}

class Cat extends Animal{
	
	/*Cat(){
		Super();  //this super will call automatically for Animal class as per constructor rule. If we want to call any constructor in Superclass then we can define constructor in super class with arguments or without according to choice through this subclass constructor.
	};*/
	void MakeSound(){
		System.out.println("Cat make a sound of Mew Mew");
	}
	
	void LivingPlace(){
		System.out.println("Cat live in a hidden place so that no one can see her.");
	}
}

class AbstractEx{
	public  static void main(String[] args){
		/* Labra L = new Labra();   //We can also make object like this for every subclass. But if we have multiple subclass (ex 100 or more.) then we cant make their object like this. It will take long time, space and will not look good.  
		Cat C = new Cat();
		*/
		/*Animal A= new Animal();*/    //here it will show error because user can not create an object of abstract class. Constructor will create of animal automatically as define above in cat/Dog class. We can call animal constructor through subclass constructor call.
		Animal A=new Labra();  // We use this method polymoorphisam so that we can make are code good and also can make an object according to user input.
		A.MakeSound();
		A.LivingPlace();
		A.Eat();
		
		A=new Cat();   //this will call a default constructor for cat function. As shown above. And it will call default constructor. If cat constructor is present then it will call else compiler will create automatically without arguments.
		A.MakeSound();
		A.LivingPlace();
		A.Eat();
	}
}