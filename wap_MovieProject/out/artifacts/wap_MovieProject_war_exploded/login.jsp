<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<html>
<head>
    <meta charset="UTF-8" />
    <title>Customer Login</title>
    <script type="text/javascript"
            src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="resources/js/login.js" type="text/javascript"></script>
    <link href="resources/css/login.css" type="text/css" rel="stylesheet" />
</head>
<body>
<div id="header" >
    <h1>Customer login information</h1>
    <div id="selection">

    </div>
</div>
<div id="container">
        <div id="img"><img src="resources/images/enjoy.png" /></div>
        <form id="details" action="login" method="post">
            <p>User Name: </p><input type="text" id="username" name="uname">
            <p>Password:</p><input type="password" id="password" name="password">
            <p><input type="checkbox" name="remember" value="remember" />Remember me </p>
            <p><input id="submit" type="submit" value="Login" /></p>
            <p id="error">${errorText}</p>
        </form>

</div>
</body>
</html>

