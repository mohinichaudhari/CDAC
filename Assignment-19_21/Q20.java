//Create a servlet that displays system date in the dd/mm/yyyy  format.
package Q20;

import java.awt.image.SampleModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse; 

@WebServlet("/Q20")
public class Q20 extends HttpServlet {
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				resp.setContentType("text/html");
				PrintWriter out = resp.getWriter();
				Date d= new Date();
				SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
				String s = sd.format(d);
				out.print("<h2>System Date 123 : "+s+"</h2>");
				out.flush();
				out.close();
				
		}
}
