package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
//		out.println("Hello sq");
		
//		get data through RequestDispatcher 
//		k: data stored in req of AddServlet
//		int k = (int) req.getAttribute("k");
		
//		get data through sendRedirect
//		parse from url
//		int k = Integer.parseInt(req.getParameter("k"));		
//		get from session
//		HttpSession session = req.getSession();
//		session.removeAttribute("k");
//		int k = (int) session.getAttribute("k");
//		get from cookie
		int k = 0;
		Cookie[] cookies = req.getCookies(); // multiple
		for (Cookie c : cookies) {
			if (c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());
				break;
			}
		}

		k = k * k;
		out.println("Result is " + k);			
	}
}
