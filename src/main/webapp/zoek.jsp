<%--
  Created by IntelliJ IDEA.
  User: sande
  Date: 17/03/2021
  Time: 13:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTPYE html>
<html lang="nl">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Zoek</title>
    <link rel="stylesheet" type="text/css" href="style.css">
<html>
<body>

<p>Dit is de zoekpagina</p>


<form action="ZoekServlet" method="get">
    <p>Zoek naar</p>
    <p>
        <label for="Voornaam">Voornaam: </label>
        <input type="text" id="Voornaam" name="Voornaam">
    </p>
    <p>
        <label for="Naam"> Naam: </label>
        <input type="text" id="Naam" name="Naam">
    </p>
    <p>
        <input type="submit" value="zoek">
    </p>
</form>

</body>
</html>



