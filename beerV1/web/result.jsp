<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>

<%--
  User: clebsonc
  Date: 21/07/17
  Time: 18:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
  <title>Beer Advice</title>
</head>
<body>
  <h1 align="center">Beer Recomendations JSP</h1>
  <p></p>
  <%
    List styles = (List) request.getAttribute("styles");
    Iterator it = styles.iterator();
    while (it.hasNext()){
      out.print("<br>try: " + it.next());
    }
  %>
</body>
</html>
