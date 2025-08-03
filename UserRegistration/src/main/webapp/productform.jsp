<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<html>
<head><title>Product Entry Form</title></head>
<body>
    <h2>Enter Product Details</h2>
    <form action="displayProduct.jsp" method="post">
        Product ID: <input type="text" name="productId" required><br><br>
        Name: <input type="text" name="name" required><br><br>
        Price: <input type="text" name="price" required><br><br>
        Quantity: <input type="number" name="quantity" required><br><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
