package com.addServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int sum = i + j;
		HttpSession session = req.getSession();
		session.setAttribute("sum", sum);

		res.sendRedirect("sqr?sum="+sum);//URL Rewriting
		
		//RequestDispatcher rd = req.getRequestDispatcher("sqr");
		//rd.forward(req, res);
		
		
	}
	 
}
