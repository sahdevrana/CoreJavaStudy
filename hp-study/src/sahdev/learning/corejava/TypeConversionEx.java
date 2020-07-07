package sahdev.learning.corejava;
class ParentInTypeConversion{
	
	public void goB(byte b){
		System.out.println("Converted to byte");
	}
	/*public void goC(char b){
		System.out.println("Converted to char");
	}*/
	public void goS(short b){
		System.out.println("Converted to short");
	}
	public void goI(int b){
		System.out.println("Converted to int");
	}
	public void goL(long b){
		System.out.println("Converted to long");
	}
	public void goF(float b){
		System.out.println("Converted to float");
	}
	public void goD(double b){
		System.out.println("Converted to double");
	}
}
class ChildInTypeConversion extends ParentInTypeConversion{
	public static void main(String[] args){
		ParentInTypeConversion p = new ChildInTypeConversion();
		byte i = 4;
		p.goB(i);
		p.goI(i);
		p.goF(i);
	//	p.goC(i); //it will show an exception of incomparable conversion. byte can't convert into char.
		p.goS(i);
		p.goL(i);
		p.goD(i);
	}
}