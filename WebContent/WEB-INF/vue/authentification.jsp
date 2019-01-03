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

<form method="post" action="authentification">
<label for="nom">user Name:</label>
<input type="text"  name="nom" id="nom"/>


<label for="nom">Login:</label>
<input type="text"  name="login" id="login"/>




<input type="submit" value="connexion"/>
</form>

${ reponse}



</body>
</html>