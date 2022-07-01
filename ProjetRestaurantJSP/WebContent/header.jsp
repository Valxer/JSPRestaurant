<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="model.Client" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<header>
    <h1><a href="Accueil.jsp">Restaurant</a></h1>

    <div id="navigation">
      <ul class="nav justify-content-center">
        <li class="nav-item"> <a class="nav-link" href="Accueil.jsp">Accueil</a></li>
        <li class="nav-item"> <a class="nav-link" href="Menu.jsp">Menu</a> </li>
        <% 
       	Client c = (Client)session.getAttribute("client");
       	if (c == null){
       		out.print("<li class='nav-item'> <a class='nav-link' href='Connexion.jsp'>Commande</a> </li>");
       		out.print("<li class='nav-item'> <a class='nav-link' href='Connexion.jsp'>Connexion/Inscription</a> </li>");
       	} else {
       		out.print("<li class='nav-item'> <a class='nav-link' href='ServletAccesCommande'>Commande</a> </li>");
       		out.print("<li class='nav-item'> <a class='nav-link' href='ServletDeconnexion'>Deconnexion</a> </li>");
       	}
       
       	%>
      </ul>
    </div>
</header>
