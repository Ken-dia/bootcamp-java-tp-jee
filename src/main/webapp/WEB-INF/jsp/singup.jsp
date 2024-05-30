<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>inscription</title>
		<link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,700' rel='stylesheet' type='text/css'>
		<link href="public/css/style.css" rel="stylesheet" type='text/css'>
	</head>
	<body>
        <div class="container">
		 	<div class="frame">
			    <div class="nav">
			    	<ul class"links">
				        <li class="signin-active"><a class="btn">Se connecter</a></li>
			      	</ul>
		    	</div>
	    		<div>
	                <form class="form-signin" action="" method="post" name="form">
		          		<label for="fullname">Prénom</label>
				        <input class="form-styling" type="text" name="first_name" placeholder=""/>
				        <label for="fullname">Nom</label>
				        <input class="form-styling" type="text" name="last_name" placeholder=""/>
				        <label for="email">Email</label>
				        <input class="form-styling" type="text" name="email" placeholder=""/>
				        <label for="password">Password</label>
				        <input class="form-styling" type="text" name="password" placeholder=""/>
				        <label for="confirmpassword">Confirm password</label>
				        <input class="form-styling" type="text" name="confirmpassword" placeholder=""/>
				        <div class="btn-animate">
		            		<a class="btn-signin">se connecter</a>
		          		</div>
				        
	                </form>
      			</div>
			    
      
  			</div>

		</div>
	</body>
</html>