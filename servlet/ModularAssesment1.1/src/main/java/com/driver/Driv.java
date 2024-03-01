package com.driver;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.establish.fetchingdata;
import com.adding.user;
import com.establish.Connections;

@WebServlet("/add")
public class Driv extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
           
			user u = null;
			PrintWriter out = null;
			try {
				response.setContentType("text/html");
                   
u = fetchingdata.getFormForinseration(request,response);
Connection con = Connections.getConnection() ;
				 String qry = "insert into ali.firstassesment VAlUES(?,?,?,?)";
					PreparedStatement pstmt = null;
					out = response.getWriter();
					 pstmt = con.prepareStatement(qry);
					       pstmt.setInt(1, u.getId());
						pstmt.setString(2,u.getFirstname());
						pstmt.setString(3, u.getDepartment());
						pstmt.setString(4, u.getSurname());
						     
							pstmt.executeUpdate();
							
			} catch (ServletException | IOException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					
					out.println("<html><body bgcolor='yellow'>" + "<h1>fetched details  are: " + u.getId() + "from " + u.getFirstname()
					+u.getDepartment()	+ " Department" + " " + u.getSurname() + "</h1>" + "</body></html>");

					out.close();
				
			
					
}}