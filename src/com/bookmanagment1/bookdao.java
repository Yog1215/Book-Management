package com.bookmanagment1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class bookdao {
	 Boolean f;
	public static boolean inserttodb(Book b) {
	boolean f=false;
	
			try {
				Connection con=CP.create();  
				
				String q="insert into book values (?,?,?,?)";
				 PreparedStatement pst = con.prepareStatement(q);
				pst.setInt(1, b. getIdNumber());
				pst.setString(2, b. getName());
				pst.setString(3, b.getBookCost());
				pst.setString(4, b. getAuthorname());
				
				pst.executeUpdate();
				f=true;
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		return f;
		
		
		
	}
	public static boolean deletetodb(int idNumber) {
		
		
		boolean f=false;
		
		try {
			Connection con=CP.create();  
			
			String q="delete from book where bookid=?";
			 PreparedStatement pst = con.prepareStatement(q);
			pst.setInt(1, idNumber);
			
			
			pst.executeUpdate();
			f=true;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	return f;
	}
	public static void displaytodb() {
		

		
		try {
			Connection con=CP.create();  
			
			String q="select * from book";
			   Statement statement = con.createStatement();
			
			  ResultSet loginRecords =  statement.executeQuery(q);
			   while(loginRecords.next()) {
		            System.out.println("bookid-> "+loginRecords.getInt(1)+
		                    "  bookname-> "+loginRecords.getString(2)+"  bookcost-> "+loginRecords.getString(3)+" author name"+ loginRecords.getString(3));
		        }
		
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	
		
	}
	public static boolean updatetodb(int idNumber,String name) {
		

		boolean f=false;
		
		try {
			Connection con=CP.create();  
			
			String q="update book set bookname=? where bookid=?";
			 PreparedStatement pst = con.prepareStatement(q);
			 pst.setInt(2, idNumber);
				pst.setString(1, name);
			
			pst.executeUpdate();
			f=true;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	return f;
		
	}
	
	
}
