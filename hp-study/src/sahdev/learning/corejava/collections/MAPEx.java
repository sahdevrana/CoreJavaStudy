package sahdev.learning.corejava.collections;
import java.util.*;

class MAPEx{
	public static void main(String [] args){
		Map <Integer,String> M = new HashMap();   //Generic will provide key and value type.<Key type, Value type>;
		M.put(1,"Sahdev");
		M.put(2,"Kumar");
		M.put(3,"Rana");
		M.put(4,"Chaudhary");
		System.out.println(M);
		System.out.println(M.get(3));
		
		Iterator <Map.Entry<Integer,String>> IT= M.entrySet().iterator();
		while(IT.hasNext()){
			Map.Entry ME = IT.next();
			System.out.println("Value: "+ME.getValue()+", Key: "+ME.getKey());
		}
		
		Set <Integer> S = M.keySet();
		for (Integer I : S){
			System.out.println("Key: "+I);
		}
		
		Collection <String> C = M.values();
		Iterator <String> ITS= C.iterator();
		while(ITS.hasNext()){
			
			System.out.println(ITS.next());
		}
	}
}