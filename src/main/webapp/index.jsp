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
		<div class="login-wrap">
    <div class="login-html">
        <input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">Connexion</label>
        <input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab"></label>
        <div class="login-form">
            <form class="sign-in-htm" method="post" action="">
                <div class="group">
                    <label for="user" class="label">Email</label>
                    <input id="user" type="text" class="input" name="email" placeholder="Entrer votre email">

                </div>
                <div class="group">
                    <label for="pass" class="label">Mot de passe</label>
                    <input id="pass" type="password" class="input" data-type="password" name="password" placeholder="Entrer votre mot de passe">

                </div>

                <div class="group">
                    <input type="submit" class="button" value="Se connecter">
                </div>

                <div class="hr"></div>
                <div class="foot-lnk">
                    <a href="signup">Créer un compte</a>
                </div>
            </form>
        </div>
    </div>
</div>
	</body>
	
</html>
