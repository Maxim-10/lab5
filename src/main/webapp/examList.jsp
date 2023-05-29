<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%--
  Created by IntelliJ IDEA.
  User: maxim
  Date: 25.05.2023
  Time: 1:12
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Exams</title>
    </head>
    <body>
        <h4>Student exams</h4>
        <ul>
            <c:forEach var="file" items="${files}">
                <a href="Exam?file=${file}">${file}<br></a>
            </c:forEach>
        </ul>
        <a href="index.jsp">to start page</a>
    </body>
</html>
