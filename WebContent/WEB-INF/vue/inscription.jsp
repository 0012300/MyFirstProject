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
<p>inscription</p>
<%@ include file="menu.jsp" %>

<% 
String [] listeName=(String[]) request.getAttribute("listeName");
out.println(listeName);


//for (int i=0; i<listeName.length; i++){

//}


%>




<p> <c:out value="bonjour jstl!!"></c:out></p>



<p> ${listeName[2]}</p>



<p>${personne.nom }  ${personne.prenom}</p>



  <c:if test="${ !empty nom }"><p><c:out value="Bonjour, vous vous appelez ${ nom }" /></p></c:if>

<form method="post" action="inscription">
<label for="nom">Nom:</label>
<input type="text"  name="nom" id="nom"/>
<input type="submit" value="envoyer"/>
</form>




</body>
</html>