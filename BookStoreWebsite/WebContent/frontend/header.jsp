<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>
	<nav class="navbar navbar-expand-sm navbar-light bg-primary">
		<a class="navbar-brand" href="#">
    <img src="images/deposit.jpg" width="70" height="70" class="d-inline-block align-top" alt="">
    Apar BookStore
 		 </a>
 		 <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#myMenu" >
    		<span class="navbar-toggler-icon"></span>
  </button>
 		 <div class="collapse navbar-collapse" id="myMenu">
    		<ul class="navbar-nav pl-5 ">
      			<li class="nav-item ">
 					<a class="nav-link" href="#">Sign In</a>
  				</li>
  				<li class="nav-item ">
 					<a class="nav-link" href="#">Register</a>
  				</li>
  				<li class="nav-item ">
 					<a class="nav-link" href="#">Cart</a>
  				</li>
  			</ul>
  		<form class="form-inline my-2 my-sm-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
     
    </form>
 
  		</div> 	
	</nav>
	 
      
 <header class="jumbotron">
		<div class="text-center">
			
      	 		<c:forEach var="tempCategories" items="${listCategory}">
      	 			   <a href="view_category?id =${ tempCategories.categoryId}"><b>${tempCategories.name }</b></a>
      	 			   &nbsp;
      	 		</c:forEach>
		</div>
	</header>

<script type="text/javascript" src="js/bootstrap.min.js" />
<script type="text/javascript" src="js/jquery.js"></script>
</body>
</html>