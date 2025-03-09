package com.multi.jsp03.b_lifecycle;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/annolifecycle")
public class LifeCycleTestXml extends HttpServlet {
    private int initCount = 1;
    private int serviceCount = 1;
    private int destroyCount = 1;

    public LifeCycleTestXml() {
        System.out.println("anntation service()메소드 호출"+serviceCount++);
    }
    @Override
    public void init() throws ServletException {
        System.out.println("anntation destroy()메소드 호출"+destroyCount++);
    }

    @Override
    public void destroy() {
        System.out.println("anntation init()메소드 호출"+initCount++);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }
}