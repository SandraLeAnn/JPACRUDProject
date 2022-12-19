<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fishing Spot Results</title>
</head>
<body>
	<h1>Spot Details</h1>

	<div>
		<c:choose>
			<c:when test="${! empty spot}">


				<h2>Results:</h2>


				<c:forEach var="s" items="${spot}">
					<ol>
						<li>
							<ul style="list-style-type: square;">

								<li>Spot Id: ${spot.id }</li>
								<li>Spot Name: ${spot.name }</li>
								<li>Description: ${spot.description }</li>
								<li>Location: ${spot.location }</li>
								<li>Body of Water Type: ${spot.waterType}</li>
								<li>Fish: ${spot.fish}</li>
							</ul>
						</li>
					</ol>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<p>No spot found</p>
			</c:otherwise>
		</c:choose>
	</div>

	<div>
		<form action="updateInProgresss.do" method="get">

			<button type="submit" name="id" value="${spot.id}">Update
				Spot</button>
		</form>
	</div>
	<br>

	<div>
		<form action="deleteSpot.do" method="post">

			<button type="submit" name="id" value="${spot.id}">Delete
				Spot</button>
		</form>
		<br>
		<form action="home.do" method="get">
			<button type="submit">Home</button>
	</div>







</body>
</html>