package com.establish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Establishment {

	public static Connection  getConnection() throws ClassNotFoundException {
 	   Connection con=null;
 	   Class.forName("com.mysql.cj.jdbc.Driver");
		
		try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ali", "root", "ROOT");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return con;
		
    }
   
}
