import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
public class WelcomeServlet extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response)
 throws ServletException, IOException {
 response.setContentType("text/html;charset=UTF-8");
 PrintWriter out = response.getWriter();
 out.println("<html><head>");
 out.println("<title>Servlet LoginServlet</title></head>"); 

String u = request.getParameter("uname");

 out.println("<body bgcolor=blue>");
 out.println("<h1> Welcome to the Servlet page !!!!!!! </h1>" + u + "Roll number 44");
 
 
 out.println("</body>");
 out.println("</html>");
 } 
}