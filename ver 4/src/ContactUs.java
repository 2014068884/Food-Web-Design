

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContactUs
 */
@WebServlet("/ContactUs")
public class ContactUs extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
	
		String name = request.getParameter("name");
		String Con = request.getParameter("Con");

		String Comments = request.getParameter("comments");
		
		out.println("<head>");
		out.println("<meta charset='ISO-8859-1'>");
		out.println("<title>FoodbUST</title>");
		out.println("<link rel='stylesheet' href='template.css'>");
		out.println("<link rel='stylesheet' href='design.css'>");
		out.println("  <style>");
		out.println("      ul {");
		out.println("list-style-type: none;");
		out.println(" margin: 0;");
		out.println("padding: 0;");
		out.println("overflow: hidden;");
		out.println(" background-color: #333;");
		out.println(" }");

		out.println(" li {");
		out.println("    float: left;");
		out.println("   }");
		out.println(" li a {");
		out.println("    display: block;");
		out.println("   color: white;");
		out.println("   text-align: center;");
		out.println("  padding: 14px 16px;");
		out.println("  text-decoration: none;");
		out.println(" }");
		out.println("       li a:hover {");
		out.println("background-color: #111;");
		out.println("}");
		out.println("</style>");
		out.println("</head>");
		out.println("<body>");
		out.println("<img src = 'images/HEADER.jpg' width = '100%'>");

		out.println("<ul class='w3-navbar w3-border w3-light-grey w3-center'>");
		out.println("  <li style='width:25%''><a class='w3-green' href='index.html'>HOME</a></li>");
		out.println("  <li style='width:25%'><a class='w3-grey' href='HTMLRestoList.html'>RESTAURANTS</a></li>");
		out.println("  <li style='width:25%''><a class='w3-grey' href='ContactUs.html'>CONTACT US</a></li>");
		out.println(" <li style='width:25%'><a class='w3-grey' href='#'>ABOUT</a></li>");
		out.println("</ul>");

		out.println("</div>");
		out.println("<div class='w3-container w3-section w3-pale-red w3-leftbar w3-border-red'>");
		out.println("<p>Thank you leaving your Comment Mr/Ms " + name + " with the Contact Information of <br></p>");
		out.println("Your Comment is <br>");
		out.println(Comments);
		out.println("</div>");
		
		out.println("<img src = 'images/FOOTER.jpg' width = '100%'>");
		out.println("</body>");
		out.println("</html>");
	}

	
		
		
	
	

}
