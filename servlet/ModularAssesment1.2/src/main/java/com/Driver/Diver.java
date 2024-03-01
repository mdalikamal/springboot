package com.Driver;

import com.establish.Establish;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.establish.Fetching;
import com.user.user;

@WebServlet("/Sear")
public class Diver extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Connection con =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
			resp.setContentType("text/html");
		com.user.user u = null;
		PrintWriter out = null;
		int Id = 0;
	Id=Fetching.getFormForinseration(req, resp);
         con 	= Establish.getConnection();
		String qry = "select * from ali.firstassesment where id=?";
		pstmt = con.prepareStatement(qry);
	    pstmt.setInt(1, Id);
		rs = pstmt.executeQuery();
	      out = resp.getWriter();
		if (rs.next()) {
			String Firstname = rs.getString(2);
			String dept = rs.getString(3);
			String last = rs.getString(4);
			u=new user(Id,Firstname,dept, last);
			out.println( u);
			// PRESENTATION LOGIC //
			out.close();
		} else {
			out.println("<html><body bgcolor='pink'>" + "<h1>No Data Found!!!!</h1>" + "</body></html>");
			// PRESENTATION LOGIC //
			out.close();
		}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		
	}
}}