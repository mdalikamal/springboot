package com.Query;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.User;

public class QueryUpdatation {
 public static void queryupdation(com.user.User u, HttpServletResponse resp) throws IOException, SQLException, ClassNotFoundException {
	 Connection con=null;
	 //HttpServletResponse resp=null;
	 PrintWriter out=resp.getWriter();
	 con= com.establish.Establishment.getConnection();
	 PreparedStatement stmt=con.prepareStatement("update ali.firstassesment set Firstname=?,Department=?,Surname=? where Id=?");
	 try { stmt.setString(1, u.getFirstname());
		stmt.setString(2, u.getDepartment());
		stmt.setString(3, u.getSurname());
		stmt.setInt(4,u.getId());
		
		stmt.executeUpdate();
		if(true)
			out.println(u) ;

		con.close();
		}
		catch(Exception e)
		{
		out.println("<b> failed</b>");
		out.println("<b>Error:</b>" +e);
		}
		}
		
}
