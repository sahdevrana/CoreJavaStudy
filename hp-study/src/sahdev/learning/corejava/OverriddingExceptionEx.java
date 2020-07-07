package sahdev.learning.corejava;
class ParentInOverriddingException{
	//public void go() throws Exception{ //This will not show an exception because it has narrow/fewer exception as compare to main/caller Class method exception.
	
	public void go(){
		System.out.println("Method of parent class.");
	}
}

class ChildInOverriddingException extends ParentInOverriddingException{
	
	//public void go() throws Exception{  //This will show an error because it have checked exception. It is also a new/broder exception for  parent class. And these both conditions should not be available for overridding.
	
	//public void go() throws IOException{  //This will not show an exception because it has narrow/fewer exception as compare to Parent Class method exception.
	
	public void go() throws RuntimeException {   //For overriding runtime exception can write and after that also it will override.  
		System.out.println("Method of child class.");
	}
}


class OverriddingExceptionEx{
	//public static void main(String[] args)throws Exception{ //Here we have to use exception specifier because it is calling parent and if parent will give any error then it should have handler.
		
	public static void main(String[] args){
		ParentInOverriddingException P= new ChildInOverriddingException();
		P.go();
	}
}