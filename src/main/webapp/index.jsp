<%--@elvariable id="pesoIdeal" type=""--%>
<html>
<head>
    <title>PESO IDEAL</title>
</head>
<body>
<h1>Calculo de Peso Ideal</h1>
<form name="imcForm" action="peso-ideal" method="GET">
    <table>
        <tr>
            <td><label for="weight">Seu sexo(F/M):</label></td>
            <td><input type="text" name="sexo" id="weight"/></td>
        </tr>
        <tr>
            <td><label for="height">Sua altura (m) :</label></td>
            <td><input type="text" name="altura" id="height"/></td>
        </tr>
        <tr>
            <th><input type="submit" value="Enviar" name="find"/></th>
            <th><input type="reset" value="Limpar" name="reset"/></th>
        </tr>
    </table>
    <%--    <h2>${pesoIdeal}</h2>--%>
    <h2>Peso Ideal: ${pesoIdeal}</h2>
</form>
</body>
</html>