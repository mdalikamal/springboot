package com.connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.user.User;

public class fetching {
    public static int getFormForinseration(HttpServletRequest req, HttpServletResponse response) {
    	 int Id = Integer.parseInt(req.getParameter("Id"));
    	
    	
    	
    	return  Id;
}
    }