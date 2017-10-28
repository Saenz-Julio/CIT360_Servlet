import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class ServletApp extends HttpServlet { 
  protected void doGet(HttpServletRequest request, 
      HttpServletResponse response) throws ServletException, IOException 
  {
    // reading the user input
    String name= request.getParameter("name");   
    String color= request.getParameter("color"); 
    PrintWriter out = response.getWriter();
    out.println (
      "<!DOCTYPE html>\n" +
      "<html> \n" +
        "<head> \n" +
          "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"> \n" +
          "<title>CIT360 - Servlet Topic</title> \n" +
        "</head> \n" +
        "<body> \n" +
          "<font size=\"12px\" color=\"black\">Here is your name in your favorite color: </font> \n" +
          "<font size=\"12px\" color=\"" + color + "\">" + name + "</font> \n" +
        "</body> \n" +
      "</html>" 
    );  
  }  
}