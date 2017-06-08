package com.fz.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by webrx on 2017-06-06.
 */
@WebServlet("/show")
public class Show extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset-utf-8");
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"utf-8\">");
        out.println("<title>玉灵 QQ:7031633 Email:webrx@126.com</title>");
        out.println("<meta name=\"keywords\" content=\"关键字\">");
        out.println("<meta name=\"description\" content=\"简介\">");
        out.println("</head>");
        out.println("<body>");
        out.println("<h3>Hello World1</h3>");
        out.println("<h3>Hello World2</h3>");
        out.println("<h3>Hello World3</h3>");
        out.println("</body>");
        out.println("</html>");
        out.flush();
        out.close();
    }
}
