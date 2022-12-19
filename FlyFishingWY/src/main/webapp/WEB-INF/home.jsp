<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fly Fishing Wyoming</title>
<link rel="stylesheet" href="/css/stylesheet">
</head>
<body>
	<h1>Fly Fishing Wyoming</h1>


	<form action="getSpotPage.do" method="GET">
		Spot ID: <input type="text" name="id" /> <input type="submit"
			value="Find ">
	</form>


	<!-- <form action="searchSpot.do" method="GET">
  Search Fishing Spot: <input type="text" id="keyword" name="keyword" />
  <input type="submit" value="Find ">
  </form> -->

	<br>

	<form action="goToCreateForm.do" method="get">
		<button type="submit">Create Spot</button>

	</form>
</body>
</html>