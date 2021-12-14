package com.jdbc;

import java.sql.*;

public class FirstJDBC {

	public static void main(String[] args) {

		
		try {
			// 1. load the driver
			
			Class.forName("com.mysql.jdbc.Driver");
			
			//2. creating connections
			String url = "jdbc:mysql://localhost:3306/test_db";
			String userid="root";
			String pass ="123456";
			Connection con = DriverManager.getConnection(url, userid,pass);
			
			
			if(con.isClosed())
			{
				System.out.println("Connection is Closed ");
			}else
			{
				System.out.println("Connection is Created  ");
				
			}
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
