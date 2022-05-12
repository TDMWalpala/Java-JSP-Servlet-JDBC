package com.addServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SquareServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		  
		HttpSession session =req.getSession();
		int sum = (int) session.getAttribute("sum");
		  
		  sum = sum*sum;
		  PrintWriter out = res.getWriter();
		  out.println("Result : " + sum);
		
		System.out.println("sqr called");
		
		session.removeAttribute("sum");
		
			
		}

}

