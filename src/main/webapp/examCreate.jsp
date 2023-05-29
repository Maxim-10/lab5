<%--
  Created by IntelliJ IDEA.
  User: maxim
  Date: 25.05.2023
  Time: 0:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Exam</title>
</head>
<body>
    <form action="examCreate" method="post">
        Student name: <input type="text" name="name"> <br>
        Student surname: <input type="text" name="surname"> <br>
        Student middlename: <input type="text" name="middlename"> <br>
        Discipline: <input type="text" name="discipline"> <br>
        Mark: <input type="number" name="mark"> <br>
        <input type="submit" value="submit">
    </form>
</body>
</html>
