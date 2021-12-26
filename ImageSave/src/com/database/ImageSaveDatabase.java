package com.database;


import java.io.FileInputStream;
import java.sql.*;
public class ImageSaveDatabase {

	public static void main(String[] args) {
		
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			
			//2. creating connections
			String url = "jdbc:mysql://localhost:3306/test_db";
			String user="root";
			String pass ="123456";
			Connection con1 = DriverManager.getConnection(url, user,pass);
			
			
			String q = "insert into images(pic) values(?)";
			
			PreparedStatement pstmt = con1.prepareStatement(q);
			
//			pstmt.setString(1, "value");
			
			FileInputStream fis  = new FileInputStream("PAWAN.jpg");
			
			pstmt.setBinaryStream(1, fis, fis.available());
			
			pstmt.executeUpdate();
			
			System.out.println("Done.. ");
			
		}catch(Exception e)
		{
			System.out.println("Error..!!");
		}
		

	}

}
