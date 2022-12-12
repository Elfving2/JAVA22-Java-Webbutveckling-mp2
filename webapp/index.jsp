<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<% if(session.getAttribute("mySession") != null) {
    response.sendRedirect("user.jsp");
}%>
<h1>Login</h1>
<form action="<%=request.getContextPath()%>/sessionServlet" method="post">
    <input type="text" name="username" placeholder="Username"> <br>
    <input type="password" name="password" placeholder="Password"> <br>
    <input type="submit" value="Login">
</form>

${wrong}

</body>
</html>