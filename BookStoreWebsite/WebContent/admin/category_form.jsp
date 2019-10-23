<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create New Category</title>

<link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="../css/style.css" />
</head>
<body>
<jsp:directive.include file="header.jsp" />
<div align="center">
	<h2>
	<c:if test="${category!=null }">
		Edit Category
	</c:if>  
		<c:if test="${category == null }">
			Create New Category</h2>
		</c:if>
</div>
<div class="row justify-content-center">
	<div class="col-md-4 col-sm-6 ">
			<c:if test="${category!=null }">
				<form class="shadow-lg" action="update_category" method="post" onsubmit="return validateFormInput()">
				<input type="hidden" name="categoryId"  value="${category.categoryId }" />
			</c:if>
			<c:if test="${ category==null }">
				<form class="shadow-lg" action="create_category" method="post" onsubmit="return validateFormInput()">
			</c:if>
  				<div class="form-group">
 			 		
   					 <label for="exampleFullName1" class="font-weight-bold">Name</label>
    					<input type="text" class="form-control" id="email" name="exampleFullName1" placeholder="Enter Category Name" value="${category.name }"><!-- shouldn't be id should me name -->
  				</div>
  				<button type="submit" class="btn btn-primary shadow-sm font-weight-bold">Save</button>
  				<button type="submit" class="btn btn-primary shadow-sm font-weight-bold">Cancel</button>
			</form>
		</div>
	</div>

<jsp:directive.include file="footer.jsp" />
 
</body>

<script type="text/javascript" src="js/bootstrap.min.js" />
<script type="text/javascript" src="js/jquery.js"></script>
 <script type="text/javascript">
	function validateFormInput(){
		var fieldName=document.getElementById("email");
		if(fieldName.value.length==0){
			alert("Category name  is required");
			fieldName.focus();
			return false;
		}
			return true;
		
	}
</script>
</html>