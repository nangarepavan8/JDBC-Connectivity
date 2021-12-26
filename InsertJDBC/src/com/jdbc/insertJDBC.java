package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class insertJDBC {

	public static void main(String[] args) {

		
		try {
			// 1. load the driver
			
			Class.forName("com.mysql.jdbc.Driver");
			
			//2. creating connections
			String url = "jdbc:mysql://localhost:3306/test_db";
			String user="root";
			String pass ="123456";
			Connection con = DriverManager.getConnection(url, user,pass);
			
			
			//  create a query
			
			String q= "create table table1(tId int(20) primary key auto_increment,tName varchar(200) not null, tCity varchar(400))";
			
		
			Statement stmt = con.createStatement();
			
//			stmt.excuteUpdate(q); 
			stmt.executeUpdate(q);
			
			System.out.println("table is created in database");
			
			
			
			con.close();
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}

