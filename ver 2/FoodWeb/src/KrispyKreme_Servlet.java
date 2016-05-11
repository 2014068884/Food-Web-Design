package com.ust.food.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class KrispyKreme_Servlet
 */
@WebServlet("/KrispyKreme_Servlet")
public class KrispyKreme_Servlet extends HttpServlet {
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
		writer.println("<img src = 'images/kk.jpg'>");
		writer.println("<p>Krispy Kreme Doughnuts, Inc. is an American global doughnut company, and coffeehouse chain based in Winston-Salem, North Carolina.</p>");
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