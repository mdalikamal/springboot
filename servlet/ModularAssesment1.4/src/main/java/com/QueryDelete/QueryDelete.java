package com.QueryDelete;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServletResponse;

import com.connection.Connections;

public class QueryDelete {
	public static void queryDelete(int Id, HttpServletResponse resp) throws IOException, SQLException, ClassNotFoundException {
		 Connection con=null;
		 
		 PrintWriter out=resp.getWriter();
		 con= Connections.getConnection();
		 PreparedStatement stmt=con.prepareStatement("delete from ali.firstassesment where id=?");
		try { 
			stmt.setInt(1,Id);
		    stmt.executeUpdate();
		   out.println( "<html><body bgcolor='blue'>" + "<h1>fetched details  are: " +  Id +" Department" + " " + "</h1>" + "</body></html>");
			

			con.close();
			}
			catch(Exception e)
			{
			out.println("<b> failed</b>");
			out.println("<b>Error:</b>" +e);
			}
			}
		
}
