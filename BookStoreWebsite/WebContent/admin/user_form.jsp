<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create New Users</title>

<link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="../css/style.css" />


</head>
<body>
<jsp:directive.include file="header.jsp" />
<div align="center">
	<h2>
	<c:if test="${user!=null }">
		Edit User
	</c:if>  
		<c:if test="${user==null }">
			Create New Users</h2>
		</c:if>
</div>
<div class="row justify-content-center">
	<div class="col-md-4 col-sm-6 ">
			<c:if test="${user!=null }">
					<!-- <form class="shadow-lg" action="update_user" method="post" onsubmit="return validateFormInput()">-->
				<form class="shadow-lg" action="update_user" method="post" id="userForm" >
				<input type="hidden" name="userId"  value="${user.userId }">
			</c:if>
			<c:if test="${user==null }">
					<!-- <form class="shadow-lg" action="create_user" method="post" onsubmit="return validateFormInput()">-->
				<form class="shadow-lg" action="create_user" method="post"  id="userForm">
			</c:if>
 			 	<div class="form-group">
 			 		<i class="fas fa-user"></i>
   					 <label for="exampleInputEmail1" class="font-weight-bold">Email</label>
    					<input type="email" class="form-control" id="email" name="exampleInputEmail1" placeholder="Enter email" value="${user.email }">
  				</div>
  				<div class="form-group">
 			 		
   					 <label for="exampleFullName1" class="font-weight-bold">Full Name</label>
    					<input type="text" class="form-control"  id="fullName" name="exampleFullName1" placeholder="Enter full Name" value="${user.fullName }"><!-- shouldn't be id should me name -->
  				</div>
  				<div class="form-group">
  					<i class="fas fa-unlock"></i>
   					 <label for="exampleInputPassword1" class="font-weight-bold">Password</label>
    				<input type="password" class="form-control" id="pwd" name="exampleInputPassword1" placeholder="Password" value="${user.password }">
  				</div>
  				<button type="submit" class="btn btn-primary shadow-sm font-weight-bold">Save</button>
  				<button type="submit" class="btn btn-primary shadow-sm font-weight-bold">Cancel</button>
			</form>
		</div>
	</div>





<jsp:directive.include file="footer.jsp" />
<script type="text/javascript" src="../js/bootstrap.min.js" />
<script type="text/javascript" src="../js/jquery.js"></script>
<script type="text/javascript" src="../js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="../js/jquery.validate.min.js"></script>

<script type="text/javascript">
$(document).ready(function(){
	$("#userForm").validate({
		rules:{
			email:"required",//id of the form fields
			fullName:"required",
			pwd:"required",
		},
		messages:{
			email:"Please enter email",
			fullName:"Please enter fullName",
			pwd:"please enteer password"
		}
		
	});
			
	
});

</script>
</body>


</html>