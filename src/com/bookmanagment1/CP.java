package com.bookmanagment1;
import java.sql.Connection;

import java.sql.DriverManager;

public class CP {
	static Connection con;
	public static  Connection create()
	
	{ 
			try 
			{
			//Class.forName("com.mysql.jdbc.driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stdb","root","@2022Manh!Manh");
			}
				  catch(Exception e)
				  {
					  e.printStackTrace();
				  }
			return con;
			  
	}
	
	
}
