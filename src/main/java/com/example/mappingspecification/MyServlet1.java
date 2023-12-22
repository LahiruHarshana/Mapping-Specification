package com.example.mappingspecification;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "MyServlet1", value = "/hello")
public class MyServlet1 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out=response.getWriter();
        out.println("<h1 style='background-color: aquamarine'>Hello</h1>");
    }
}