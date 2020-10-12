//19. Create a servlet that prints WELCOME TO SERVLET WORLD using html's heading tag. 
package Q19;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Q19")
public class Q19 extends HttpServlet {
	
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			resp.setContentType("text/html");
			PrintWriter out =  resp.getWriter();
			out.print("<h1>WELCOME TO SERVLET WORLD<h1>");
			out.flush();
			out.close();
		}
}
