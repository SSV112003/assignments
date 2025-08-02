<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.example.registration.BankAccount" %>
<jsp:useBean id="account" class="com.example.registration.BankAccount" scope="request" />
<jsp:setProperty name="account" property="*" />

<%
    // Store account type in session
    String accountType = request.getParameter("accountType");
    session.setAttribute("accountType", accountType);
%>

<html>
<head><title>Bank Account Details</title></head>
<body>
    <h2>Bank Account Information</h2>
    
    <!-- Use EL to access JavaBean properties -->
    <p><strong>Account Number:</strong> ${account.accountNo}</p>
    <p><strong>Name:</strong> ${account.name}</p>
    <p><strong>Balance:</strong> ₹${account.balance}</p>

    <!-- Display account type from session -->
    <p><strong>Account Type (Session):</strong> ${sessionScope.accountType}</p>

    <!-- Conditional EL: Check if balance is sufficient -->
    <p><strong>Balance Status:</strong> 
        ${account.balance >= 1000 ? 'Sufficient' : 'Insufficient'}
    </p>
</body>
</html>
