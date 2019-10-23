<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="../css/style.css" />
</head>
<body>

<jsp:directive.include file="header.jsp" />
<div class="text-center">

	<h2>Quick Actions</h2>
	<b>
	<a href="create_book" class="pl-3">New Books</a>
	<a href="create_user" class="pl-3">New Users</a>
	<a href="create_category"class="pl-3">New Category</a>
	<a href="create_customer"class="pl-3">New Customer</a>
	</b>			
</div>

<div class="text-center">
	<p>Recent Sales</p>
</div>

<div class="text-center">
	<p>Recent Reviews</p>
</div>

<div class="text-center">
	<p>Statistics</p>
</div>

<jsp:directive.include file="footer.jsp" />

<script type="text/javascript" src="js/bootstrap.min.js" />
<script type="text/javascript" src="js/jquery.js"></script>

</body>
</html>