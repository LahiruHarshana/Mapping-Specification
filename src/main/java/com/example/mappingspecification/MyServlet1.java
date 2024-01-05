package com.example.mappingspecification;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "MyServlet1", value = "/hello/")
public class MyServlet1 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out=response.getWriter();
        out.println("<h1 style='background-color: aquamarine'>Hello</h1>");

        System.out.println(request.getContextPath());
        System.out.println(request.getServletPath());
        System.out.println(request.getPathInfo());
        System.out.println(request.getRequestURI());
        System.out.println(request.getQueryString());
        System.out.println(request.getRequestURL());
        System.out.println(request.getRemoteAddr());
        System.out.println(request.getRemoteHost());
        System.out.println(request.getRemotePort());
        System.out.println(request.getRemoteUser());
        System.out.println(request.getScheme());
        System.out.println(request.getServerName());
        System.out.println(request.getServerPort());
        System.out.println(request.getProtocol());
    }
}