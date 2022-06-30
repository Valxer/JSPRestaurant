<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Selection des articles</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
</head>
<body>
<h1>Fais ton repas</h1>
<h3>La commande de Client.NOM-Prenom ( Montant de panier : panier.total(session))</h3>
<div id="container">
	<div id="menu sélection">
		<p>Fais ton choix parmi nos plats de qualité:</p>
		<form action="Ajout">
			<select class="form-select" name="select">
			  <option selected>Selectionne un article</option>
			  <c:forEach var="article" items="${articles}">
			  		<option value=<c:out value="${article.ref }" />><c:out value="${article.nom}" /></option>
			  </c:forEach>
			</select>
			<div class="col-4">
				Quantité :<input name="quantite" type="number">				
			</div>
			<button type="submit" class="btn btn-primary" value="ajouter">Ajouter</button>			
		</form>
	</div>
	<div id="panier">
	<table class="table table-striped">
			<thead class="thead-dark">
				<tr>
				    <th>Articles</th>
				    <th>Quantité</th>
				    <th>Prix total</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="achat" items="${panier }">	
				    <tr>
				    	<td><c:out value="${achat.nomart }" /></td>
				    	<td><c:out value="${achat.quantite }" /></td>
			            <td><c:out value="${achat.total }" /></td>
				    </tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</div>

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.5/dist/umd/popper.min.js" integrity="sha384-Xe+8cL9oJa6tN/veChSP7q+mnSPaj5Bcu9mPX5F5xIGE0DVittaqT5lorf0EI7Vk" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.min.js" integrity="sha384-kjU+l4N0Yf4ZOJErLsIcvOU2qSb74wXpOhqTvwVx3OElZRweTnQ6d31fXEoRD1Jy" crossorigin="anonymous"></script>
</body>
</html>