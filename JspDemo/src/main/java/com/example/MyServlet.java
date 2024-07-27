package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/MyServlet")
@WebServlet("/addAlien")
public class MyServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//		PrintWriter out = response.getWriter();
//		out.print("Hi ");
//		int k = 9/0;
		
//		jstl
//		String name = "navin";
//		request.setAttribute("label", name);
		
//		Student s = new Student(1, "navin");
//		request.setAttribute("student", s);
//		List<Student> students = Arrays.asList(new Student(1, "navin"), new Student(2, "aaron"), new Student(3, "peter"));
//		request.setAttribute("students", students);
//		RequestDispatcher rd = request.getRequestDispatcher("show.jsp");
//		rd.forward(request, response);
		
//		filter
		PrintWriter out = response.getWriter();
		System.out.println("In serv");
		int aid = Integer.parseInt(request.getParameter("aid"));
		String aname = request.getParameter("aname");
		out.println("welcome " + aname);
		
	}
}
