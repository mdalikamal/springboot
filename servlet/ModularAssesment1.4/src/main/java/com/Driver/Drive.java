package com.Driver;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.QueryDelete.QueryDelete;
import com.connection.fetching;


     
	
	@WebServlet("/Del")
	public class Drive extends HttpServlet {
		@Override
		public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

			resp.setContentType("text/html");
			
			int Id = fetching.getFormForinseration(req, resp);
			
				try {
					QueryDelete.queryDelete(Id,resp);
				} catch (ClassNotFoundException | IOException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
}}