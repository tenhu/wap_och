<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<html>
<head>
    <meta charset="UTF-8" />
    <title>Payment</title>
    <script type="text/javascript"
            src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="resources/js/payment.js" type="text/javascript"></script>
    <link href="resources/css/payment.css" type="text/css" rel="stylesheet" />
    <link rel="shortcut icon" href="../resources/images/favicon.ico">
</head>
<body>
<div id="header" >
    <h1>Payment information</h1>
    <div id="selection">
        <div id="login">
            <span id="alogin"><a href="login.jsp">LOGIN</a> </span>
            <span id="logout"><a href="movie.jsp">LOG OUT</a></span>
        </div>
    </div>
</div>
<div id="container">
    <form id="details" action="result" method="post">

        <div id="paymentValue">
            <p>  Total Count:  ${tCount}  <input type="hidden" name="tCount" value="${tCount}">  </p>
            <p>  Total Value:  ${tPrice} $<input type="hidden" name="tPrice" value="${tPrice}"> </p>
        </div>

        <div id="custinfo">
            <fieldset>
                <legend>Customer information</legend>
                <p>Your Name: </p><input type="text" id="name" />
                <p>Phone Number: </p><input type="text" id="phone" />
                <p>E-mail: </p><input type="email" id="email" />
            </fieldset>
        </div>
        <div id="paymentinfo">
            <fieldset >
                <legend>Account information</legend>
                <p>Cardholder name: </p><input type="text" id="cardholder" />
                <p>Card number: </p><input type="text" id="cardnumber" />
                <p>Card Expiration date: </p><input type="text" id="expmonth" size="3"/> / <input type="text" id="expyear" size="4"/>
                <p>Security code: </p><input type="text" id="securitycode" />
            </fieldset>
            <div id="submit">
                <input id="cancel" type="submit" id="payCancelBtn" value="Cancel" />
                <input id="confirm" type="submit" id="payConmBtn" value="Confirm" />
            </div>
        </div>
    </form>
</div>
</body>
</html>

