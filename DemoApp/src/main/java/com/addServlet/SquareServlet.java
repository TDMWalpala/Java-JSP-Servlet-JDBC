package com.addServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;

@WebServlet("/sqr")
public class SquareServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		 int sum = 0;
	     Cookie cookies[] = req.getCookies(); 
	    
	    for(Cookie c : cookies) {
	    	if(c.getName().equals("sum")){
	            sum = Integer.parseInt(c.getValue());
	           
	    	}
	    }
	    
	    sum = sum*sum;
		PrintWriter out = res.getWriter();
		out.println("Result : " + sum);
		System.out.println("sqr called");
			
		}

}

