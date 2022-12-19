import java.sql.*;

public class FirstJDBC
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
	
			String url = "jdbc:mysql://localhost:3306/student_manage";
			String usr = "root";
			String pass = "abhi";

			Connection con = DriverManager.getConnection(url, usr, pass);
			
			if(con.isClosed())
			{
			
				System.out.println("Connection is closed");
			
			}		
			else
			{
				
				System.out.println("Connection is created");
	
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
