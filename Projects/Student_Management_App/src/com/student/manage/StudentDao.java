package com.student.manage;

import  java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class StudentDao {
	
		public static boolean insertStudentToDB(Student st)
		{
			boolean flag = false;
			try {
				
				//jdbc code..
				Connection con = Cp.createC();
				String q = "insert into students(sname, sphone, scity) values(?, ?, ?)";
				//prepared Statement
				PreparedStatement pstmt = con.prepareStatement(q);
				pstmt.setString(1, st.getStudentNameString());
				pstmt.setString(2, st.getStudentPhoneString());
				pstmt.setString(3, st.getStudentCity());
				
				//exicute....
				pstmt.executeUpdate();
				flag = true;
				
			} catch (Exception e) {
				// TODO: handle exception 
				e.printStackTrace();
			}
			return flag;
		}

		public static boolean deleteStudentToDB(int userId) {
			// TODO Auto-generated method stub
			boolean flag = false;
			try {
				
				//jdbc code..
				Connection con = Cp.createC();
				String q = "delete from students where sid=?";
				//prepared Statement
				PreparedStatement pstmt = con.prepareStatement(q);
				pstmt.setInt(1, userId);
				
				//exicute....
				pstmt.executeUpdate();
				flag = true;
				
			} catch (Exception e) {
				// TODO: handle exception 
				e.printStackTrace();
			}
			return flag;
		}

		
		
		public static void displayStudent() {
			// TODO Auto-generated method stub
try {
				
				//jdbc code..
				Connection con = Cp.createC();
				String q = "select * from Students";
				//prepared Statement
				Statement st = con.createStatement();
				ResultSet set = st.executeQuery(q);
				while(set.next())
				{
					int id = set.getInt("sid");
					String name = set.getString(2);
					String phone = set.getString(3);
					String city = set.getString("scity");
					
					System.out.println("Id : "+id);
					System.out.println("Name : "+name);
					System.out.println("Phone : "+phone);
					System.out.println("City : "+city);
					System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
				}
				
			} catch (Exception e) {
				// TODO: handle exception 
				e.printStackTrace();
			}
		}

		public static boolean updateStudent(int id, String newName, String newPhone, String newCity) {
			// TODO Auto-generated method stub
			boolean flag = false;
			try {
				
				//jdbc code..
				Connection con = Cp.createC();
				String q = "update students set sname =?, sphone=?, scity=? where sid=?";
				//prepared Statement
				PreparedStatement pstmt = con.prepareStatement(q);
				pstmt.setString(1, newName);
				pstmt.setString(2, newPhone);
				pstmt.setString(3, newCity);
				pstmt.setInt(4, id);
				
				//exicute....
				pstmt.executeUpdate();
				flag = true;
				
			} catch (Exception e) {
				// TODO: handle exception 
				e.printStackTrace();
			}
			return flag;
		}
}
