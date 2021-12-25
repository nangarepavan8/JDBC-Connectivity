package com.database;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class PreparedStatement {

	public static void main(String[] args) {
		
		try {
			// 1. load the driver
			
			Class.forName("com.mysql.jdbc.Driver");
			
			//2. creating connections
			String url = "jdbc:mysql://localhost:3306/test_db";
			String user="root";
			String pass ="123456";
			Connection con1 = DriverManager.getConnection(url, user,pass);
			
			
			//  create a query
			
			String q = "insert into table1 (tName, tCity) values (? ,?)";
			
			java.sql.PreparedStatement pstmt = con1.prepareStatement(q);
			
			
			
			// dyanamic input from buffer readers
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter Name: ");
			String name =br.readLine();
			
			System.out.println("Enter City: ");
			String city=br.readLine();
			
			
			// static value
			 ((java.sql.PreparedStatement) pstmt).setString(1,name);
			 ((java.sql.PreparedStatement) pstmt).setString(2,city);
			
			
			((java.sql.PreparedStatement) pstmt).executeUpdate();
			
			
			
			System.out.println("inserted");
			
			
			con1.close();
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	

}
