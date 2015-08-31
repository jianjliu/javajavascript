
package org.javajavascript.demo.http.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class ServletRequest extends HttpServlet {
 
	private static final long serialVersionUID = -4158918599635586932L;

	public void doGet(
    		HttpServletRequest request,
    		HttpServletResponse response) throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Method: " + request.getMethod());
        out.println("Request URI: " + request.getRequestURI());
        out.println("Protocol: " + request.getProtocol());
        out.println("PathInfo: " + request.getPathInfo());
        out.println("Remote Address: " + request.getRemoteAddr());
        out.flush();
    }

    public void doPost(
    		HttpServletRequest request,
    		HttpServletResponse response) throws IOException, ServletException
    {
        doGet(request, response);
    }
}
