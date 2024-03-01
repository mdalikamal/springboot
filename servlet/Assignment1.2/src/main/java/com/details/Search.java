package com.details;

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

@WebServlet("/Searc")

public class Search extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int Id = Integer.parseInt(req.getParameter("Id"));
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String qry = "select * from ali.firstassesment where id=?";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ali", "root", "ROOT");
			pstmt = con.prepareStatement(qry);
			

			pstmt.setInt(1, Id);
			rs = pstmt.executeQuery();
			// PERSISTENCE LOGIC //
			PrintWriter out = resp.getWriter();
			if (rs.next()) {
				String Firstname = rs.getString(2);
				String dept = rs.getString(3);
				String last = rs.getString(4);
				
				out.println("<html><body bgcolor='yellow'>" + "<h1> USER  Details are " + Firstname + "from " + dept
						+ " Department" + "</h1>" + "</body></html>");
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
	}
}
