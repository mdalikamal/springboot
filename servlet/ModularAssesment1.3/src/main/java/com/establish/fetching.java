package com.establish;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.user.User;

public class fetching {
       public static User getFormForinseration(HttpServletRequest req, HttpServletResponse response) {
    	   int Id = Integer.parseInt(req.getParameter("Id"));
			String Firstname=req.getParameter("Firstname");
		String Department=req.getParameter("Department");
		String Surname=req.getParameter("Surname");
         return new User(Id,Firstname,Department,Surname);
       }
}
