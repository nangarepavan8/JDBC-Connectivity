package com.database;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.database.ConnectionProvider;

public class updateValues {

	public static void main(String[] args) {
	
		try {
			
			Connection con = ConnectionProvider.getConnection();
			
			String q = "update table1 set tName=? , tCity=?, where tid=?";
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter new Name: ");
			
			String name = br.readLine();
			
			System.out.println("Enter new City: ");
			
			String city = br.readLine();
			
			System.out.println("Enter the student ID: ");
			
			int id = Integer.parseInt(br.readLine());
			
			
			PreparedStatement pstmt = con.prepareStatement(q);
			
			pstmt.setString(1, name);
			pstmt.setString(2, city);
			pstmt.setInt(3, id);
			
			
//			pstmt.executeUpdate();
			pstmt.executeUpdate();
			
			System.out.println("Done....!");
			
			
			con.close();
			
		}catch(Exception e)
		{
			System.out.println("Error..!!");
		}
		

	}

}
