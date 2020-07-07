package sahdev.learning.corejava;
import java.io.*;

class IOFileEx{
	public static void main(String[] args) throws IOException{
		
		//create a folder.
		
		File dir= new File("D:/Core Java HP/Java Training/IOEx");
		
		dir.mkdir(); //it will create folder by given name 'at given destination path/in given folder' if folder of this name is not available. If available then it will not create any folder with same name.
		
		
		//create a file.
		
		//File file= new File("D:/Core Java HP/Java Training/IOEx1.txt"); // we can use this cmd to chose name and path of any file/folder.
		
		File file= new File(dir, "IOEx1.txt"); //this will use to make  a file/folder of given name in string inside of given folder.(folder name, "file/folder name").
		
		file.createNewFile();  //it will create file by given name 'at given destination path/in given folder' if file of this name is not available. If available then it will not create any file with same name.
		
		
		//to.getOutput(get output from system side means write content in file.)
		
		String contentString= "My name is Sahdev. It is an example file of input and output in file.";
		
		FileOutputStream fileOutputStream= new FileOutputStream(file);  // to create an object of class FileOutputStream and pass file name it which we  want to write but it will take only file type.
		
		fileOutputStream.write(contentString.getBytes());   //it will write ccontent in file but it takes int or byte[] type value so we get the Byte[] of our content and pass it to write cmd.
		
		
		
		
		//To take input means read any file.
		
		FileInputStream fileInputStream= new FileInputStream(file);  // to take input from any file passed to class constructor.
		
		fileInputStream.read();  //to read the value from file pointed by ref variable and return int value from file in packets.
		
		int i = -1;  //initialize an int variable.
		
		
		/*while ((FIP.read())!=-1){  // When all packets from a file will complete and no data will able to return in int throug this read function then it return/store -1.  
			
			//System.out.println(FIP.read());     // It will print packet of int  received from the file through read(). Println will print every packet iin new line so println will not use.
			
			System.out.println((char)(FIP.read()));  //it will print packets alternatly because first packet will call in while conndition and second  in SOP so  alternate packet will convert in char and print. Here typecasting will use to convert int value in char value.
		}
		*/
		
		while ((i=fileInputStream.read())!=-1){
			
			//System.out.print(i);  // it will print packet of int value. So typecasing is mandatory.  
			
			System.out.print((char)(i));  //here full msg will print because read cmd will use and store value in i. And then convert it into char by typecasting.
			
		}
		fileOutputStream.close();
		fileInputStream.close();
	}
}