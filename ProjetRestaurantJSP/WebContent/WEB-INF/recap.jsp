<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Recap Page</title>
</head>
<body>
	<h3>La commande de <c:out value="${client.nom} ${client.prenom}" /></h3>
	<table border="1" class="table table-striped">
			<thead class="thead-dark">
				<tr>
				    <th>Articles</th>
				    <th>Quantité</th>
				    <th>Prix </th>
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
					<tr>
						<td>Total : </td>
						<td colspan="2"><c:out value="${totalp }" /></td>
					</tr>
			</tbody>
		</table>
	</div>
	<a href="OrderCompleted">Valider</a>
</body>
</html>