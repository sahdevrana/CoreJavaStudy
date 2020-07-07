package sahdev.learning.corejava;
import java.sql.*;


class DatabaseEx{
	static String Name="root";
	static String Password="";
	
	public static void main(String [] args){
		try{
			String URL = "jdbc:mysql://localhost:3306/hpes";
			Class.forName("com.mysql.jdbc.MyDriver");
			
			try{
				Connection CON = DriverManager.getConnection(URL,Name,Password);
				String Querry = "create tabel Student(SNO,SID,SNAME,SCLASS)";
				
				Statement ST= CON.createStatement();
				int Status = ST.executeUpdate(Querry);
				System.out.println(Status);
			}
			catch (SQLException SQLE){
				System.out.println("Connection did not create");
				SQLE.printStackTrace();
			}
			
		}
		catch (ClassNotFoundException CNFE){
			System.out.println("Driver is not working");
			CNFE.printStackTrace();
		}
	}
}