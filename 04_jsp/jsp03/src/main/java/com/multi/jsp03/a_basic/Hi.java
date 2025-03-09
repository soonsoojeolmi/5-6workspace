package com.multi.jsp03.a_basic;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hi")
public class Hi extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Do GET request handling here
        System.out.println("들어오나");

        String q  = request.getParameter("q");

        System.out.println(q);

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.write("<hi>"+q+"</hi>");
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Do POST request handling here
        System.out.println("post 요청이 들어옴");
        System.out.println(request.getCharacterEncoding());
        System.out.println(response.getContentType());
        request.setCharacterEncoding("UTF-8");

        String id  = request.getParameter("id");
        String pw = request.getParameter("pw");
        System.out.println(id);

        response.setContentType("text/html;charset=UTF-8");
       PrintWriter out = response.getWriter();
       out.write("<hi>"+id+"</hi>");
       out.close();
    }
}