package sahdev.learning.corejava;
abstract class AnimalInTypeCasting{
	abstract String Sound();
}


class DogInTypeCasting extends AnimalInTypeCasting{
	public String Sound(){
		return ("Bhow Bhow");
	}
	
	public String Nature(){
		return ("Dogs have loyal nature");
	}
}

class CatInTypeCasting extends AnimalInTypeCasting{
	public String Sound(){   //it cant be a void type because if we call any function in S.O.P in any class. then that function have some return value and void dont give return value.
		return ("Mew Mew");
	}
}

class TypeCastingEx{
	public static void main(String[] args){
		AnimalInTypeCasting [] Ani= new AnimalInTypeCasting [3];   //it will create an array of animal type of size 3.
		Ani[0]=new DogInTypeCasting();
		Ani[1]=new CatInTypeCasting();
		Ani[2]=new DogInTypeCasting();
		
		for (AnimalInTypeCasting A: Ani){   // it is a for each loop. Foreach loop: make a refrence variable to store value and then use that array or list which we want to execute. For each value in array or list this condition will execute.
			if (A instanceof DogInTypeCasting){   // in this it will check that is refrence variable A have or getting value of object type Dog and if true then it will execute.
				DogInTypeCasting D= (DogInTypeCasting) A;   //Here refrence variable A will covert in Dog type and will store in dog type variable D so that we can call all the functions available in Dog. Cz from parent type object we can ccall only thoese fun which are available in parent class. It is typecasting.
				System.out.println("Dog Sound: "+D.Sound()+", Dog Nature: "+D.Nature());
			}
			if (A instanceof CatInTypeCasting){
				CatInTypeCasting C= (CatInTypeCasting) A;
				System.out.println("Cat Sound: "+C.Sound());
			}
		}
	}
}