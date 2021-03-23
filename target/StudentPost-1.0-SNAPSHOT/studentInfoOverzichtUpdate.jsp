<%@ page import="domain.model.Student" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="domain.db.StudentDB" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!doctype html>
<html lang="nl">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Student Info: Overzicht</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>

<p><a href="zoek.jsp"> Zoek </a></p>

<table>
    <thead>
    <tr>
        <th>Naam</th>
        <th>Voornaam</th>
        <th>Leeftijd</th>
        <th>Studierichting</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>Janssens</td>
        <td>Jan</td>
        <td>24</td>
        <td>Toegepaste Informatica</td>
    </tr>

    <%
        StudentDB studentDataBase = (StudentDB) request.getAttribute("newDB");
        for (Student student : studentDataBase.getAllStudents()) {
    %>
    <tr>
        <td><%=student.getNaam() %>  </td>
        <td><%=student.getVoornaam() %>  </td>
        <td><%=student.getLeeftijd() %>  </td>
        <td><%=student.getStudierichting() %>  </td>
    </tr>
    <%
        }
    %>
    </tbody>
</table>

</body>
</html>
