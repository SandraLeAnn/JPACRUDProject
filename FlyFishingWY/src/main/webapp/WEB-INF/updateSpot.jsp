<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    TAG<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UpdateSpot</title>
</head>
<body>
<h1>hello!</h1>


<p>Update your spot that has an id of: ${spot.id}</p>



<form action="updateSpot.do" method="POST">


	<input id="id" name="id" type="hidden" value="${spot.id}" placeholder="${spot.id }">
 
  <label for="name" >Name of Spot:</label><br>
  
  <input type="text" id="name"  name="name"><br>
  
  <label for="description">Description:</label><br>
  
  <input type="text"id="description"  name="description"><br>
  
  <label for="waterType">Type of Body of Water:</label><br>
  
  <input type="text" id="waterType" name="waterType"><br>
  
  <label for="location">Location:</label><br>
  
  <input type="text" id="location" name="location"><br>
  
  <label for="fish">Types of Fish:</label><br>
  
  <input type="text" id="fish" name="fish">
  
  <label for="imgURL">Add Image:</label><br>
  
  <input type="text" id="imgURL" name="imgURL" placeholder="Image URL"><br>

	  
 <input type="submit">

</form>
</body>
</html>