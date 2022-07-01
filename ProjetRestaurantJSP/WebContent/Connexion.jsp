<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	<header>
    <h1><a href="Accueil.jsp">Restaurant</a></h1>

    <div id="navigation">
      <ul class="nav justify-content-center">
        <li class="nav-item"> <a class="nav-link" href="Accueil.jsp">Accueil</a></li>
        <li class="nav-item"> <a class="nav-link" href="#">Menu</a> </li>
        <li class="nav-item"> <a class="nav-link" href="ServletAccesCommande">Commande</a> </li>
        <li class="nav-item"> <a class="nav-link" href="Connexion.jsp">Connexion/Inscription</a> </li>
      </ul>
    </div>
  </header>
  
  <h2>Connexion/Inscription</h2>
  
  <hr>
  
  <h3>Déjà client ? Connectez-vous:</h3>
	<form action = "ServletConnexion">
		<label for="identifiant">Identifiant</label>
		<input name = "identifiant" type = "number"/><br><br>
	
		<label for="mdp">Mot de passe</label>
		<input name = "mdp" type = "password"/><br><br>
	
		<input type = "submit" value ="Se connecter"/>
	</form>
	
	<hr>
	
	<h3>Première visite ? Inscrivez-vous:</h3>
	<form action = "ServletInscription">
		<label for="identifiant">Identifiant</label>
		<input name = "identifiant" type = "number" required/><br><br>
	
		<label for="mdp">Mot de passe</label>
		<input name = "mdp" type = "password" required/><br><br>
		
		<label for="nom">Nom</label>
		<input name = "nom" type = "text" required/><br><br>
		
		<label for="prenom">Prenom</label>
		<input name = "prenom" type = "text" required/><br><br>
		
		<label for="adresse">Adresse</label>
		<input name = "adresse" type = "text" required/><br><br>
	
		<input type = "submit" value ="S'inscrire"/>
	</form>
</body>
</html>