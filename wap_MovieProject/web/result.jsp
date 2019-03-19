<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Order</title>

    <link href="resources/css/result.css" type="text/css" rel="stylesheet" />
    <script type="text/javascript"
            src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript"
            src="resources/js/payment.js"></script>
</head>
<body>


<div id="header" >
    <h1>E-Movie-Ticket Confirmation</h1>
    <div id="selection">
        Your order is completed.

    </div>
</div>
<div id="container">
    <div class="description">
        <div id="img"><img src="${movies.pictureUrl}" /></div>
        <div id="details">
            <ul id="info">
                <li><strong>Movie Name: </strong><span id="name">${movies.movieName}</span></li>
                <li><strong>Date: </strong><span id="date">${movies.date}</span> </li>
                <li><strong>Time: </strong><span id="time">${movies.time}</span> </li>
                <li><strong>Show Room: </strong><span id="showroom">${movies.showroom}</span> </li>
                <li><strong>Ticket count: </strong><span id="ticketcount">${tCount}</span> </li>
                <li><strong>Total amount: </strong><span id="totalamount">${tPrice}$</span> </li>
            </ul>
            <div id="buttons">
                <input id="print" type="button"  value="Print" />
                <input id="home" type="button" onclick="homeBtn();" value="Back to home page" />
            </div>
        </div>
    </div>
</div>

</body>
</html>
