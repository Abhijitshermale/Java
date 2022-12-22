
package com.servlets;
import jakarta.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;


public class FirstServlet implements Servlet {
//Life cycle method 
    
    ServletConfig conf;
    
    @Override
    public void init(ServletConfig conf)
    {
        this.conf = conf;
        System.out.println("creating object .......");    
    }
    
    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException
    {
        System.out.println("Servicing............");
        
        //set the content type of the response
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>This is my output from Servlet method</h1>");
        out.println("<h1>Todays date and time is "+new Date().toString()+"</h1>");
    }
    
    @Override
    public void destroy()
    {
        System.out.println("Goin to destroy servlet object");
    }
    
    //non lif cycle method
    
    @Override
    public ServletConfig getServletConfig()
    {
        return this.conf;
    }
    
    @Override
    public String getServletInfo()
    {
        return "this servlet is created by Abhi";
    }    
}
