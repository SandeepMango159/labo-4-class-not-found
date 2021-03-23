<%--
  Created by IntelliJ IDEA.
  User: sande
  Date: 17/03/2021
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTPYE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>studentForm</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<p>yo dit is een form</p>


<p>
    <%
        if (request.getAttribute("result") != null ) { %>
    <p> <%=request.getAttribute("result") %> </p>
        <%}%>
</p>

<form action="ZoekServlet" method="post">
    <p>Voeg toe</p>
    <p>
        <label for="Voornaam">Voornaam: </label>
        <input type="text" id="Voornaam" name="voornaam">
    </p>
    <p>
        <label for="Naam"> Naam: </label>
        <input type="text" id="Naam" name="naam">
    </p>
    <p>
        <label for="Leeftijd"> Leeftijd: </label>
        <input type="number" id="Leeftijd" name="leeftijd">
    </p>
    <p>
    <label for="Studiericthing"> StudieRichting: </label>
    <input type="text" id="Studiericthing" name="studieRichting">
    </p>
    <p>
        <input type="submit" value="zoek">
    </p>
</form>

</body>
</html>
