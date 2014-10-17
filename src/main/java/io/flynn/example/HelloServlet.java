package io.flynn.example;

import java.io.IOException;
import java.lang.System;
import java.net.InetAddress;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/plain");
        response.setStatus(HttpServletResponse.SC_OK);

        String port = System.getenv("PORT");
        String hostname = InetAddress.getLocalHost().getHostName();
        response.getWriter().println("Hello from Flynn on port " + port + " from container " + hostname);
    }
}
