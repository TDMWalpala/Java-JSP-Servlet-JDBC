package com.addServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		  
		  int sum = Integer.parseInt(req.getParameter("sum"));
		  sum = sum*sum;
		  PrintWriter out = res.getWriter();
		  out.println("Result : " + sum);
		
		System.out.println("sqr called");
		
			
		}

}

