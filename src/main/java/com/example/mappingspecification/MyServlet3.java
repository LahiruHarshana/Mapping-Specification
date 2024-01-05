package com.example.mappingspecification;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "MyServlet3", value = "*.php")
public class MyServlet3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<h1 style='background-color: aquamarine'>Hello I am Servlet3</h1>");


        System.out.println(req.getContextPath());
        System.out.println(req.getServletPath());
        System.out.println(req.getPathInfo());
        System.out.println(req.getRequestURI());
        System.out.println(req.getQueryString());
        System.out.println(req.getRequestURL());
    }
}
