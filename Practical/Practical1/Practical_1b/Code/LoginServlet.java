import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

  
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException{ 
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String uname = request.getParameter("username");
            String Password = request.getParameter("Password");
             if(uname.equals("admin") && Password.equals("12345"))
              {
                out.println("<body bgcolor=blue> ");
                out.println("<h1>Welcome !!! " + uname);
               }
                else
               {
                   out.println("<body bgcolor=red>");
                    out.println("<h1>Login Failed");
            
        }
    }

    

}
}

