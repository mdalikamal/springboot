package com. register;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Registe")
public class Register extends HttpServlet{
	@Override
public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		response.setContentType("text/html");
      int Id = Integer.parseInt(request.getParameter("id"));
		String Firstname = request.getParameter("Firstname");
		String Department = request.getParameter("Department");
		String Surname = request.getParameter("Surname");
          PrintWriter out = response.getWriter();
	        Connection con = null;
		PreparedStatement pstmt = null;
		String qry = "insert into ali.firstassesment VAlUES(?,?,?,?)";
		try {
			// load drivers 
			Class.forName("com.mysql.cj.jdbc.Driver");
			// establish the connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ali", "root", "ROOT");
			pstmt = con.prepareStatement(qry);
			// set values
			pstmt.setInt(1, Id);
			pstmt.setString(2, Firstname);
			pstmt.setString(3, Department);
			pstmt.setString(4, Surname);
			pstmt.executeUpdate();
	out.println("<html><body bgcolor='yellow'>" + "<h1>fetched details  are: " + Firstname + "from "+Department+ "Department"+ "" + Surname + "</h1>" + "</body></html>");
      out.close();
      
       } catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
