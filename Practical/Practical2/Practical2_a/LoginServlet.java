import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

public class LoginServlet extends HttpServlet {


public void doGet(HttpServletRequest request, HttpServletResponse response)
 throws ServletException, IOException {
 response.setContentType("text/html;charset=UTF-8");
 PrintWriter out = response.getWriter();
 out.println("<html><head>");
 out.println("<title>Servlet LoginServlet</title></head>"); 
 String uname = request.getParameter("uname");
 String upass = request.getParameter("upass");
 if(uname.equals("shivbahadur") && upass.equals("password123")){
 RequestDispatcher rd = request.getRequestDispatcher("WelcomeServlet");
 rd.forward(request, response);
 }
 else{
 out.println("<body bgcolor=red >");
 out.println("<h1> Login Fail !!! </h1>");
 RequestDispatcher rd = request.getRequestDispatcher("/index.html");
 rd.include(request, response);
 }
 out.println("</body>");
 out.println("</html>");
 }
}