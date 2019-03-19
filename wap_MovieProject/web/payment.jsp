<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta charset="UTF-8" />
    <title>Payment</title>
    <script type="text/javascript"
            src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="resources/js/payment.js" type="text/javascript"></script>
    <link href="resources/css/payment.css" type="text/css" rel="stylesheet" />
    <link rel="shortcut icon" href="resources/images/favicon.ico">
</head>
<body>
<div id="header" >
    <h1>Payment information</h1>
    <div id="selection">
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
                <p>Your Name: </p><input type="text" id="name" value="<c:if test="${nameSession == 'ok'}">${user.userName}
            </c:if>"  />
                <p>Phone Number: </p><input type="text" id="phone" value="<c:if test="${nameSession == 'ok'}">${user.phoneNo}
            </c:if>" />
                <p>E-mail: </p><input type="email" id="email" value="<c:if test="${nameSession == 'ok'}">${user.email}
            </c:if>" />
            </fieldset>
        </div>
        <div id="paymentinfo">
            <fieldset >
                <legend>Account information</legend>
                <p>Cardholder name: </p><input type="text" id="cardholder" pattern="[A-Za-z]*" title="Only letters!" required/>
                <p>Card number: </p><input type="text" id="cardnumber" pattern="[0-9]{16}" title="must be 16 digits!" required/>
                <p>Card Expiration date : </p><input id="expmonth" type="month" required/>
                <p>Security code: </p><input type="text" id="securitycode" pattern="[0-9]{3}" title="must be 3 digits!" required/>
            </fieldset>
            <div id="submit">
                <input id="cancel" type="button" id="payCancelBtn" value="Cancel" />
                <input id="confirm" type="submit" id="payConmBtn" value="Confirm" />
            </div>
        </div>
    </form>
</div>
</body>
</html>

