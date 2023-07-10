package com.mykyta.web;

import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class MyServlet extends HttpServlet {
    public static final String HTML_START = "<html><body>";
    public static final String HTML_END = "</body></html>";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter out = resp.getWriter();
        Date date = new Date();
//        throw new RuntimeException();
        out.println("<html><body><h2>Hi There!</h2><br/><h1>Date=" + date + "</h1></body></html>");
    }
}