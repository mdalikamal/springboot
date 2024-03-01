package com.establish;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.adding.user;
import com.establish.Connections;



public class fetchingdata {
	  public static  user getFormForinseration(HttpServletRequest request, HttpServletResponse response)
	   			throws ServletException, IOException, SQLException {
	    	        user u = null  ;
	    		int Id = Integer.parseInt(request.getParameter("id"));
	    		String Firstname = request.getParameter("Firstname");
	    		String Department = request.getParameter("Department");
	    		String Surname = request.getParameter("Surname");
	    		PrintWriter out = response.getWriter();
	    		return u=new user(Id,Firstname,Department,Surname);
	    	     
	    	
	  }
	  
	  
}
