package com.update;
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

@WebServlet("/Updat")

public class Updateing extends HttpServlet {
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	int Id = Integer.parseInt(req.getParameter("Id"));
			String Firstname=req.getParameter("Firstname");
		String Department=req.getParameter("Department");
		String Surname=req.getParameter("Surname");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();

		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			                                      
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ali", "root","ROOT");
		PreparedStatement stmt=con.prepareStatement("update ali.firstassesment set Firstname=?,Department=?,Surname=? where Id=?");
	    stmt.setString(1, Firstname);
		stmt.setString(2, Department);
		stmt.setString(3, Surname);
		stmt.setInt(4,Id);
		stmt.executeUpdate();
		if(true)
			out.println("<html><body bgcolor='yellow'>" + "<h1>UPDATED  details  are: " + Firstname + "from " + Department+ " Department" + " " + Surname + "</h1>" + "</body></html>");

		con.close();
		}
		catch(Exception e)
		{
		out.println("<b> failed</b>");
		out.println("<b>Error:</b>" +e);
		}
		}
		}