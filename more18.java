/*
 Lab Exercise 1
Yeo Ewe Wen 
20DDT20F1016
DDT5A
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class more18 extends HttpServlet {
    
    public void init() throws jakarta.servlet.ServletException{
        System.out.println("The system is ready to be used.");
    }   
   
    public void service(ServletRequest req, ServletResponse res) throws IOException, jakarta.servlet.ServletException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        System.out.println("The system is processed.");
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Driving License Company</title>");            
        out.println("</head>");
        out.println("<body>");
        out.println("<h3>You are only eligible to apply a car or motorcycle driving license or both.</h3>");
        out.println("</body>");
        out.println("</html>");
        
        destroy();
    }
    
    public void destroy(){
        
        System.out.println("The system is destroyed.");
        
    }
}
