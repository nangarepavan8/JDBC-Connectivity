package com.database;

import java.sql.Connection;
import java.sql.*;

public class selectJDBC {

	public static void main(String[] args) {
	
		try
		{
			Connection con = ConnectionProvider.getConnection();
			
			String q = "select * from table1";
			
			Statement stmt = con.createStatement();
			
			ResultSet set = stmt.executeQuery(q);
			
			
			while(set.next())
			{
				int id = set.getInt(1);
				
				String name = set.getString(2);
				String city = set.getString(3);
				
				System.out.println("ID : "+ id +" Name: "+ name +" city: " + city);
			}
			
			
			
		}
		catch(Exception e)
		{
			System.out.println("Error..!!");
		}

	}

}
