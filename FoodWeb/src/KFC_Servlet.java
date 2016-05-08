package com.ust.food.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class KFC_Servlet
 */
@WebServlet("/KFC_Servlet")
public class KFC_Servlet extends HttpServlet {
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
		writer.println("<img src = 'images/kfc.jpg'>");
		writer.println("<p>Kentucky Fried Chicken is a fast food restaurant chain that" +
			"specializes in fried chicken and is headquartered in Loiusville, Kentucky," +
			"in the United States. It is the world's second largest restaurant chain after" +
			"McDonald's with 18 875 outlets in 118 countries and territories as of December 2013.</p>");
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
