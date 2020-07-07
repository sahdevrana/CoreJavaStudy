package sahdev.learning.corejava;
import java.io.*;

class MultipleIOFunctionEx{
	
	public static void main(String[] args){
		
		FileOutputStream FOS =null;
		
		
		
		FileInputStream FIS = null;
		
		 
		
		try{

			File file1 = new File("D:/Core Java HP/Java Training/IOEx/IOEx1.txt");  //File is already present so did not use to create new file.
			
			File file= new File("D:/Core Java HP/Java Training/IOEx1/IOEx1.txt");  //File is already present so did not use to create new file.
			
			/*FOS= new FileOutputStream(file);  //consider that file have some content and there is no need to write content.
			FOS.write(Content.getBytes[]);*/
			
			int  i=-1;

			long Time1= System.nanoTime();
			
			FOS= new FileOutputStream(file);
			
			FIS = new FileInputStream(file1);
			
			BufferedInputStream BIS = new BufferedInputStream(FIS);
			
			BufferedOutputStream BOS = new BufferedOutputStream(FOS);
			
			if((i=BIS.read())!=-1) {
				
				System.out.print((char)(i));
				System.out.print("Now BOS.write(i) will execute.");
				BOS.write(i);
				
			}
			
			long Time2= System.nanoTime();
			
			System.out.println("Time taken by code to read and write: "+(Time2-Time1)+" Nano Sec");
		
		}
		
		catch (IOException IOE){
			
			IOE.printStackTrace();
		
		}
		
		finally {
			
			try{
				
				FOS.flush();
				
				FOS.close();

			}
			
			catch (IOException IOE) {
				
				IOE.printStackTrace();
			
			}
		}
	}
}


/* FOR Character received at place of int packate we use reader. 
 FileReader replace FileInputStream.
 FileWriter replace FileOutputStream.
 BufferedReader replace BufferedInputStream.
 BufferedWriter replace BufferedOutputStream.
 
 
 String line:
 For String line to get full line as input and full line as output it use:
 int i = -1 will replaced by String S = null;
 in while condition string will compared by null because when no data will available then it will return null.
 */