//Create a servlet that prints following error message using red color font.“CREATING GUI IS COMPLEX USING SERVLET”. 
package Q21;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Q21")
public class Q21 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.print("<h2 style='color:red'>CREATING GUI IS COMPLEX USING SERVLET</h2>");
		out.flush();
		out.close();
	}
}
