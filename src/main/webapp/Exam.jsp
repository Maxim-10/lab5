<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: maxim
  Date: 25.05.2023
  Time: 1:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table {
            border: 4px double #333; /* Рамка вокруг таблицы */
            border-collapse: separate; /* Способ отображения границы */
            width: 50%; /* Ширина таблицы */
            border-spacing: 7px 11px; /* Расстояние между ячейками */
        }
        td {
            padding: 5px; /* Поля вокруг текста */
            border: 1px solid #a52a2a; /* Граница вокруг ячеек */
        }
    </style>
</head>
<body>
<table>
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Middlename</th>
        <th>Discipline</th>
        <th>Mark</th>
    </tr>
        <c:forEach var="exam" items="${exams}">
    <tr>
            <td>${exam.getStudentName()}</td>
            <td>${exam.getStudentSurname()}</td>
            <td>${exam.getStudentMiddlename()}</td>
            <td>${exam.getDiscipline()}</td>
            <td>${exam.getMark()}</td>
    </tr>
        </c:forEach>
</table>
<br>
<a href="ExamList">Back</a>
</body>
</html>
