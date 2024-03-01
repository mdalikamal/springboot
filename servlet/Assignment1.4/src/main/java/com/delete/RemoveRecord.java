package com.delete;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Remove")

public class RemoveRecord extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -460586402641652909L;
    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	resp.setContentType("text/html");
	   PrintWriter out=resp.getWriter();
	   int id = Integer.parseInt(req.getParameter("id"));
	   try
	   {
		   Class.forName("com.mysql.cj.jdbc.Driver");
	   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ali","root","ROOT");	
	    PreparedStatement stmt=con.prepareStatement("delete from ali.firstassesment where id=?");
	    stmt.setInt(1,id);
	    stmt.executeUpdate();
		if(true)
			out.println("<html><body bgcolor='green'>" + "<h1>fetched details  are: " +  id +" Department" + " " + "</h1>" + "</body></html>");

		con.close();
		}
	    catch(Exception e)
	   {
	    	e.printStackTrace();
	   	   }
	 }
	}
