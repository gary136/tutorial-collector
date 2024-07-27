package com.example;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
//	HttpServletRequest req & HttpServletResponse res are assigned by Tomcat
	
//	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
//	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1")); // from <input type="text" name="num1">
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i + j;
		
//		System.out.println("result is " + k);
//		PrintWriter out = res.getWriter();
//		out.println("result is " + k);	
		
//		dispatch - pass req to another servlet without the client knowing about the change in resource handling
//		req.setAttribute("k", k); // put k inside req to forward key-value pair {"k": k}		
//		RequestDispatcher rd = req.getRequestDispatcher("sq"); // goes to url sq then mapped to com.example.SqServlet through web.xml
//		forward a request from AddServlet to SqServlet
//		rd.forward(req, res); // the control is transferred to the destination resource 
		
//		redirect - browser lead users to another page and url mapping to the Servlet
//		use response to redirect
//		res.sendRedirect("sq");
//		URL rewriting concatenate k in url so later can be parsed
//		res.sendRedirect("sq?k=" + k); // session management under the hood
//		session
//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);
//		res.sendRedirect("sq");
//		cookie
		Cookie cookie = new Cookie("k", k + ""); // can only pass string so cast k to string
		res.addCookie(cookie);
		res.sendRedirect("sq");
	}
}
