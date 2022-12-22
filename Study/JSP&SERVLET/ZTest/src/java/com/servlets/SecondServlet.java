package com.servlets;

import jakarta.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class SecondServlet extends GenericServlet{

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("servicing .................");
        res.setContentType("text/html");
        PrintWriter out  = res.getWriter();
        out.println("<h1>This is my second Servlet using generic servlet(abstract class of Servlet interface)</h1>");
    }
    
}
