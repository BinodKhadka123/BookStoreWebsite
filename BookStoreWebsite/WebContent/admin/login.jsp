<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
<link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="../css/style.css" />
<link rel="stylesheet" type="text/css" href="../css/all.min.css" /> 
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous">

<script type="text/javascript" src="../js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="../js/jquery.validate.min.js"></script>
</head>
<body>
<div class="container-fluid">
	
	<div class="row justify-content-center" style="margin-top:20vh">
		<div class="col-md-4 col-sm-6">
			<form class="shadow-lg" action="login" method="post" id="formLogin">
				<h2 class="text-center">Admin Login</h2>
 			 	<div class="form-group">
   			
   					 <i class="fas fa-user"></i>
   					 <label for="exampleEmail1" class="font-weight-bold">Email</label>
    					<input type="email" class="form-control" id="email" placeholder="Enter email">
  				</div>
  				<div class="form-group">
  					
					<i class="fas fa-unlock"></i>
   					 <label for="exampleInputPassword1" class="font-weight-bold">Password</label>
    				<input type="password" class="form-control" id="pwd" placeholder="Password">
  				</div>
  				 <button type="submit" class="btn btn-primary shadow-sm font-weight-bold">Login</button>
			</form>
		</div>
	</div>
	</div>
	<script type="text/javascript">
	$(document).ready(function(){
	$("#formLogin").validate({
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