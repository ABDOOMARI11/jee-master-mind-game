<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>masterMind-game</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
    <h1 style="text-align: center; font-family: 'Agency FB';">Master Mind Jeu</h1>
    <form action="jeu-servlet" method="post">
        <div class="mb-3">
            <label class="form-label" style="font-family: 'Agency FB'">Entrer un nombre</label>
            <input type="text" class="form-control" name="nombrePropose">
        </div>
        <button type="submit" class="btn btn-success" style="font-family: 'Agency FB'">Jouer</button>
<%--        <button type="submit" class="btn btn-danger" name="reset" style="font-family: 'Agency FB'">Réinitialiser le jeu</button>--%>
<%--        <input type="hidden" name="action" value="reset">--%>
    </form>
    <div class="mb-4" style="font-family: 'Agency FB'; text-align: center">
    <c:forEach var="msg" items="${bean.lstMessages}">
        <c:out value="${msg}" /> <br>
    </c:forEach>
    </div>
</div>
</body>
</html>
