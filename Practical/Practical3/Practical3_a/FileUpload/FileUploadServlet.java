import java.io.IOException;
import java.io.*;
import javax.servlet.*;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.*;


@MultipartConfig
public class FileUploadServlet extends HttpServlet {

public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, 
IOException
{
 res.setContentType("text/html");
 
 PrintWriter out = res.getWriter();
 
 String path=req.getParameter("destination");
 
 Part filePart=req.getPart("file");
 
 String filename=filePart.getSubmittedFileName().toString();
 
 out.print("<br><br><hr> file name: "+filename);
 
 OutputStream os=null;
 
 InputStream is=null;
 
try {
    
 os=new FileOutputStream(new File(path+File.separator+filename));
 
 is=filePart.getInputStream();
 
 int read=0;
 
 while ((read = is.read()) != -1) {
     
 os.write(read);
 
 }
 out.println("<br>file uploaded sucessfully...!!!");
 
 }

 catch(FileNotFoundException e){out.print(e);}

} 

}
   