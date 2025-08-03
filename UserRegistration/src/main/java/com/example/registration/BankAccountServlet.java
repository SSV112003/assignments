package com.example.registration;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/processAccount")
public class BankAccountServlet extends HttpServlet {

    // Show the form when accessed via GET
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("accountForm.jsp");
        dispatcher.forward(request, response);
    }

    // Handle form submission via POST
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String accountNo = request.getParameter("accountNo");
        String name = request.getParameter("name");
        double balance = Double.parseDouble(request.getParameter("balance"));
        String accountType = request.getParameter("accountType");

        BankAccount account = new BankAccount();
        account.setAccountNo(accountNo);
        account.setName(name);
        account.setBalance(balance);

        request.setAttribute("account", account);
        request.getSession().setAttribute("accountType", accountType);

        RequestDispatcher dispatcher = request.getRequestDispatcher("displayAccount.jsp");
        dispatcher.forward(request, response);
    }
}
