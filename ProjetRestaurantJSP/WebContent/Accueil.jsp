<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="model.Client" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
<title>Restaurant</title>
</head>
<body>
	<header>
    <h1><a href="Accueil.jsp">Restaurant</a></h1>

    <div id="navigation">
      <ul class="nav justify-content-center">
        <li class="nav-item"> <a class="nav-link" href="Accueil.jsp">Accueil</a></li>
        <li class="nav-item"> <a class="nav-link" href="#">Menu</a> </li>
        <li class="nav-item"> <a class="nav-link" href="ServletAccesCommande">Commande</a> </li>
        <% 
        	Client c = (Client)session.getAttribute("client");
        	if (c == null){
        		out.print("<li class='nav-item'> <a class='nav-link' href='Connexion.jsp'>Connexion/Inscription</a> </li>");
        	} else {
        		out.print("<li class='nav-item'> <a class='nav-link' href='ServletDeconnexion'>Deconnexion</a> </li>");
        	}
        
        %>
      </ul>
    </div>
  </header>
  
  <h2>Accueil</h2>
	
</body>
</html>