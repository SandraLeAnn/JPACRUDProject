<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Fishing Spot</title>
</head>
<body>
<h1>Create </h1>
<form action="createSpot.do" method="POST">


  <label for="name">Name of Spot:</label><br>
  
  <input type="text"  name="name"><br>
  
  <label for="description">Description:</label><br>
  
  <input type="text" name="description"><br>
  
  <label for="waterType">Type of Body of Water:</label><br>
  
  <input type="text"  name="waterType"><br>
  
  <label for="location">Location:</label><br>
  
  <input type="text"  name="location"><br>
  
  <label for="fish">Types of Fish:</label><br>
  
  <input type="text" id="fish" name="fish"><br>
  
  <label for="imgURL">Add Image:</label><br>
  
  <input type="text" id="imgURL" name="imgURL"><br><br>
 <input type="submit">

</form>
<br>
<form action="home.do" method="get">
 <button type="submit">Home</button>
 
</body>
</html>