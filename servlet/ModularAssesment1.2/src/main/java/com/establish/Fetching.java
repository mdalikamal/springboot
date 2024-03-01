package com.establish;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Fetching {
	 public static  int getFormForinseration(HttpServletRequest req, HttpServletResponse response)
	   			throws ServletException, IOException, SQLException {
		 int Id = Integer.parseInt(req.getParameter("Id"));
		 return Id ;
	 }
}
