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
        Please insert your login information
    </div>
</div>
<div id="container">
        <div id="img"><img src="resources/images/enjoy.png" /></div>
        <form id="details">
            <fieldset >
                <legend>Your order details</legend>
                <p>Movie name: <span id="movieinfo">Wonder park, 17th March,12:00, showroom 1</span> </p>
                <p>Movie name: <span id="ticketinfo">2 tickets, 20usd</span> </p>
            </fieldset>
            <p>User Name: </p><input type="text" id="username">
            <p>Password:</p><input type="password" id="password">
            <input id="submit" type="submit" value="Login" />
            <hr>
            <p>Your Name: </p><input type="text" id="name" />
            <p>Phone Number: </p><input type="text" id="phone" />
            <p>E-mail: </p><input type="email" id="email" />
            <input id="signup" type="submit" value="Sign Up" />
        </form>
</div>
</body>
</html>

