package com.example.mappingspecification;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "MyServlet1", value = "/servlet1")
public class MyServlet1 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out=response.getWriter();
        out.println("<h1>I am </h1>" +
                "<h1>MyServlet1</h1>" +
                "<h1>in the package</h1>" +
                "<h1>com.example.mappingspecification</h1>" +
                "<h1>with the url-pattern</h1>" +
                "<h1>/servlet1</h1>" +
                "<h1>in the web.xml file</h1>" +
                "<h1>and the annotation</h1>");
    }

}