package com.ust.food.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sbarro_Servlet
 */
@WebServlet("/Sbarro_Servlet")
public class Sbarro_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<head>");
		writer.println("<title>FoodbUST</title>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("<img src = 'images/HEADER.jpg' width = '100%'>");
		writer.println("<img src = 'images/sbarro.jpg'>");
		writer.println("<p>Sbarro, LLC is a chain of pizzeria that specializes in New York style pizza by the slice and other Italian-American cuisine.</p>");
		writer.println("</body>");
		writer.println("</html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
