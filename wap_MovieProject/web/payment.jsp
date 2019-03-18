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
        <span></span>
    </div>
</div>
<div id="container">
    <form id="details">
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
                <p>Zip code: </p><input type="text" id="zipcode" />
            </fieldset>
            <div id="submit">
                <input id="cancel" type="submit" value="Cancel" />
                <input id="confirm" type="submit" value="Confirm" />
            </div>
        </div>
    </form>
</div>
</body>
</html>

