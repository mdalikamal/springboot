package com.establish;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connections {
       public static Connection  getConnection() {
    	   Connection con=null;
    	   try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ali", "root", "ROOT");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return con;
		
       }
      
     
       
}
