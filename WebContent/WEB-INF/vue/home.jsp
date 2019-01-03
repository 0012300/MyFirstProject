<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>home</p>

<%@ include file="menu.jsp" %>

<form method="post" action="Accueil">
<label for="nom">Nom:</label>
<input type="text"  name="nom" id="nom"/>

<label for="prenom">Prénom:</label>
<input type="text"  name="prenom" id="prenom"/>

<input type="submit" value="envoyer"/>
</form>






  <ul>
        <c:forEach var="utilisateur" items="${ listUtilisateurs }">
            <li><c:out value="${ utilisateur.prenom }" /> <c:out value="${ utilisateur.nom }" /></li>
        </c:forEach>
    </ul> 






</body>
</html>