package com.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	
	private static Connection con;
	
	public static Connection getConnection()
	{
		
		try {
			
			if(con == null)
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db", "root", "123456");
				
			}
		}catch(Exception e)
		{
//			System.out.println("Error..!!");
			e.printStackTrace();
		}
		
		return con;
	}

}
