package sahdev.learning.corejava;
import java.io.*;

class FileDirEx{
	public static void main(String [] args) throws IOException{
		
		//create a folder.
		
		File dir= new File("D:/Core Java HP/Java Training/IOEx1.txt");
		
		boolean de= dir.exists();  //it will give an boolean value if file/folder of same name is present.
		
		System.out.println(de);  //give true if not present.
		
		dir.mkdir(); //it will create folder by given name 'at given destination path/in given folder' if folder of this name is not available. If available then it will not create any folder with same name.
		
		
		//create a file.
		
		//File file= new File("D:/Core Java HP/Java Training/IOEx1.txt"); // we can use this cmd to chose name and path of any file/folder.
		
		File file= new File(dir, "IOEx1.txt"); //this will use to make  a file/folder of given name in string inside of given folder.(folder name, "file/folder name").
		
		boolean fe= file.exists();  //it will give an boolean value iff file of same name is present.
		
		System.out.println(fe); //give true if not present.
		
		file.createNewFile();  //it will create file by given name 'at given destination path/in given folder' if file of this name is not available. If available then it will not create any file with same name.
		
		
		
		//rename an exists file.
		File Rename= new File(dir,"IOEx2.txt");  //Same as new file creation cmd.
		
		file.renameTo(Rename);  //it will rename an exists file pointed by file refrence variable. It will also return boolean value if rename then return true. If file is availabe with same name then it wiill not rename of any file and return false.
		
		System.out.println(file.renameTo(Rename));  //if rename then it will print true else it will print false.
	}
}