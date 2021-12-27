package com.database;

import java.io.File;
import java.io.FileInputStream;
import java.sql.*;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class saveImage {

	public static void main(String[] args) {
		
		try {

			Connection con1 = ConnectionProvider.getConnection();
			
			String q = "insert into imagess(pic) values(?)";
			
			
			PreparedStatement pstmt = con1.prepareStatement(q);
			
			JFileChooser jfc = new JFileChooser();
			
			jfc.showOpenDialog(null);
			
			File file = jfc.getSelectedFile();
			
			FileInputStream   fis = new FileInputStream(file);
			
			pstmt.setBinaryStream(1, fis ,  fis.available());
			
			pstmt.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "success..!!");
			
			
			
		}catch(Exception e)
		{
			System.out.println("Error..!!");
		}

	}

}
