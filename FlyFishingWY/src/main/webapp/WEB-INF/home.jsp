<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fly Fishing Wyoming</title>
</head>
<body>
<h1>Fly Fishing Wyoming</h1>


	<form action="getSpot.do" method="GET">
  Spot ID: <input type="text" name="id" />
  <input type="submit" value="Find ">
  </form>
  
  <div >
	<c:choose>
		<c:when test="${! empty spot}">

			<h2>Results:</h2>

			<ul style="list-style-type: square;">
			
				<li>Spot Id: ${spot.id }</li>
       			<li>Spot Name: ${spot.name } </li>
       			<li>Description: ${spot.description } </li>
       			<li>Location: ${spot.location } </li>
       			<li>Body of Water Type: ${spot.waterType} </li>
       			<li>Fish: ${spot.fish} </li> 
       			
       			
			
			</ul>
		</c:when>
		<c:otherwise>
			<p>No spot found</p>
		</c:otherwise>
	</c:choose>
</div>
  
  
  <form action="goToCreateForm" method="get">
  <button type="submit">Create Spot</button>
  
  </form>
  

<form action="updateInProgresss.do" method="get">

<button type="submit" name="id" value="${spot.id}">Update Spot</button>
</form>







</body>
</html>