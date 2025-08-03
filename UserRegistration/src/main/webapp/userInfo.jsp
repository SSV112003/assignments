<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>User Info Display</title>
</head>
<body>

<h2>Submitted Information:</h2>

<p><strong>User Name:</strong> ${param.username}</p>
<p><strong>Password:</strong> ${param.password}</p>
<p><strong>Address:</strong> ${param.address}</p>
<p><strong>Newsletter Subscribed:</strong> ${param.newsletter}</p>

<p><strong>Favorite Frameworks:</strong><br/>
<%
    String[] frameworks = request.getParameterValues("framework");
    if (frameworks != null) {
        for (String fw : frameworks) {
            out.println("- " + fw + "<br/>");
        }
    } else {
        out.println("None selected.");
    }
%>
</p>

<p><strong>Gender:</strong> ${param.gender}</p>
<p><strong>Favorite Number:</strong> ${param.favnumber}</p>

</body>
</html>
