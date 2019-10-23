<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manage Categories -Apar BookStore Administration</title>

<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>
<jsp:directive.include file="header2.jsp" />
 <!-- <div align="center">
	<h2>Users Management</h2>
	<h3><a href="user_form.jsp" >Create New users</a></h3>
 </div>-->
 <header class="jumbotron">
		<div class="text-center">
				<h2>Categories Management</h2><br/><br/>
				<h4><p class="font-weight-bold text-danger">Welcome Admin</p></h4>
			<h3><a href="category_form.jsp" >Create New Category</a></h3>
		</div>
	</header>
 
 <c:if test="${message!=null }">
 <div align="center">
 	<h3>${message }</h3>
 </div>
 </c:if>
 <div align="center">
 	
<table class="table table-striped">
  	<thead class="thead-light ">
  	
 		<tr>
 			
      		<th scope="col">Index</th>
      		<th scope="col">ID</th>
     		 <th scope="col">Name</th>
     		 <th scope="col">Actions</th>
 		</tr>
 	</thead>
 	<tbody>
 		<c:forEach var="tempCategories" items="${listCategory}"  varStatus="status">
 			<tr>
 				
 				<td>${status.index + 1 }</td>
 				<td>${tempCategories.categoryId}</td>
 				<td>${tempCategories.name}</td>
 				<td>
 					<a href="edit_category?id=${tempCategories.categoryId }">Edit</a>&nbsp;
 					<a href="delete_category?id=${tempCategories.categoryId }" onclick="if(!(confirm('Are you sure you want to delete the user with ID '+${tempCategories.categoryId})))return false">Delete</a>
 				</td>
 			</tr>
 		
 		</c:forEach>
 	</tbody>		
 	</table>
 </div>

<jsp:directive.include file="footer.jsp" />

</body>
</html>

  
