package sahdev.learning.corejava;

class NullEx{
	int a=5;
	public static void main(String[] args){
		NullEx N=new NullEx();
		NullEx N1=N.go(N); //here N1 will store null value because function go is returning null value.
		System.out.println("Value of a through N1: "+N1.a);  //here it wii show NullPointerException because I am calling a istance variable through N1 refrence variable and it has a null value. We cant call any member by Null refrence variable using (.)dot.
	}
	
	public NullEx go(NullEx N2){   // here NullEx is a return type of go function so that we can return value. NullEx N2 is a parameter pass to this and it is a NullEx type.
		return null;
	}
}
