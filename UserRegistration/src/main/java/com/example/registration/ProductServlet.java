package com.example.registration;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/product")
public class ProductServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Show the form on GET
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("productform.jsp");
        rd.forward(request, response);
    }

    // Process the form on POST
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Create bean and set properties
        Product product = new Product();
        product.setProductId(request.getParameter("productId"));
        product.setName(request.getParameter("name"));
        product.setPrice(Double.parseDouble(request.getParameter("price")));
        product.setQuantity(Integer.parseInt(request.getParameter("quantity")));

        // Set in request scope
        request.setAttribute("product", product);

        // Forward to display JSP
        RequestDispatcher rd = request.getRequestDispatcher("displayProduct.jsp");
        rd.forward(request, response);
    }
}
