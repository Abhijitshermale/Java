package com.student.manage;

import java.sql.DriverManager;
import java.sql.Connection;

public class Cp {
	
	static  Connection con;
	
	public static Connection createC()
	{
		try {
			
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//create the connection..
			String user = "root";
			String password = "abhi";
			String url = "jdbc:mysql://localhost:3306/student_manage"; 
			
			con = DriverManager.getConnection(url, user, password);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return con;
	}
}
