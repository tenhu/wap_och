<%--
  Created by IntelliJ IDEA.
  User: tenhu
  Date: 2019-03-16
  Time: 12:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Order</title>

    <link href="resources/css/order.css" type="text/css" rel="stylesheet" />
    <script type="text/javascript"
            src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript"
            src="resources/js/order.js"></script>
</head>
<body>


<div id="header" >
    <h1>E-Movie-Ticket Order</h1>
    <div id="selection">
        Please insert your ticket count.

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
                <li><strong>Seats Avialable: </strong><span id="seats">${movies.available}</span> </li>
                <li><strong>Show Room: </strong><span id="showroom">${movies.showroom}</span> </li>
            </ul>
        </div>
    </div>
    <div id="ticket">
        <p><pre>Ticket count: </pre><input type="text" id="ticketcount" name="ticketcount" required ></p>
        <p><pre>Ticket price:  </pre><input type="text" id="price" disabled value="${movies.ticketPrice}">$</p>
        <p><pre>Total price:    </pre><input type="text" id="totalprice" name="totalprice" disabled>$</p>
        <div id="buttons">
            <input type="button" id="cancelBtn" value="Cancel" />
            <input type="button" id="confirmBtn" value="Confirm" />
        </div>
    </div>
</div>

</body>
</html>
