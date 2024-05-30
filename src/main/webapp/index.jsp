<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>login</title>
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
	    		<div ng-app ng-init="checked = false">
	                <form class="form-signin" action="" method="post" name="form">
		          		<label for="username">Email</label>
		          		<input class="form-styling" type="text" name="email" placeholder=""/>
		          		<label for="password">Mot de passe</label>
		          		<input class="form-styling" type="text" name="password" placeholder=""/>
		          		<input type="checkbox" id="checkbox"/>
		          		<label for="checkbox" ><span class="ui"></span>se souvenire de moi</label>
		          		<div class="btn-animate">
		            		<a class="btn-signin">se connecter</a>
		          		</div>
	                </form>
      			</div>
			    <div class="forgot">
			        <a href="#">Forgot your password?</a>
			    </div>
  			</div>
		</div>
	</body>
	
</html>
