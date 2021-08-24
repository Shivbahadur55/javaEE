import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DownloadServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
response.setContentType("APPLICATION/OCTET-STREAM");
String filename = request.getParameter("filename");
ServletContext context = getServletContext();
InputStream is = context.getResourceAsStream("/" + filename);
//ServletOutputStream out = response.getOutputStream(); // any of the two works
PrintWriter out=response.getWriter();
response.setHeader("Content-Disposition","attachment; filename=\"" + filename + "\""); //if comment this statement then it wl ask you about the editor with which you want to open the file
int i;
while ((i=is.read()) != -1) {
out.write(i);
}
is.close();
out.close();

}
}