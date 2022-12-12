<%@ page import="java.io.PrintWriter" %>
<%@ page import="controller.uppgift2.model.Bean" %><%--
  Created by IntelliJ IDEA.
  User: Sebastian
  Date: 2022-12-07
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% if(session.getAttribute("mySession") == null) {
    response.sendRedirect("index.jsp");
}%>

<%
    if(session.getAttribute("mySession") != null) { %>
        <% Bean bean = (Bean)session.getAttribute("mySession");%>
        <h1> Welcome <%=bean.getUsername()%> </h1>
        <form action="<%=request.getContextPath()%>/ServletRemove" method="post">
            <input type="submit" value = "Remove Session">
        </form>
    <%}%>

${error}

</body>
</html>
