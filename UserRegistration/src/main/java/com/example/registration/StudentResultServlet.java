package com.example.registration;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/studentResult")
public class StudentResultServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("studentName");
        int marks = Integer.parseInt(request.getParameter("studentMarks"));

        request.setAttribute("name", name);
        request.setAttribute("marks", marks);

        if (marks >= 40) {
            RequestDispatcher rd = request.getRequestDispatcher("pass.jsp");
            rd.forward(request, response);
        } else {
            RequestDispatcher rd = request.getRequestDispatcher("fail.jsp");
            rd.forward(request, response);
        }
    }
}
