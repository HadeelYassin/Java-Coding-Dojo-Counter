<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 06/01/2021
  Time: 19:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Counter</title>
</head>
<body>
<h2>You have visited <a href="/your_server"> http://your_server</a>   <c:out value="${count}"/></h2>
<p><a href="/your_server"> Test another visit?</a></p>
</body>
</html>
