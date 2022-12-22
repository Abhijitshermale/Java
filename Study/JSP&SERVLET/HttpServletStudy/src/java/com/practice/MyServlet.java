
package com.practice;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
/**
 *
 * @author Lenovo
 */
public class MyServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        System.out.println("This is get method ............");
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<h1>this is my get method of servlet created by using httpServlet class</h1>");
        out.println(new Date().toString());
    }
}
