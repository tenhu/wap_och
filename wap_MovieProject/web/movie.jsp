<%--
  Created by IntelliJ IDEA.
  User: tenhu
  Date: 2019-03-15
  Time: 13:21
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Movies</title>

    <link href="resources/css/main.css" type="text/css" rel="stylesheet" />
    <script type="text/javascript"
            src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript"
            src="resources/js/main.js"></script>
</head>

<body>
<div id="header" >
    <h1>Welcome to E-Movie-Ticket</h1>

<div id="divselect"> Select your date:
    <select id="selection">
        <option value="2019-03-19">2019/03/19</option>
        <option value="2019-03-20">2019/03/20</option>
        <option value="2019-03-21">2019/03/21</option>
    </select>
    <div id="login">


        <c:if test="${nameSession == 'ok'}">
            <span id="logout"><a href="logout">LOG OUT</a></span>
        </c:if>
        <c:if test="${nameSession != 'ok'}">
            <span id="alogin"><a href="login">LOGIN</a> </span>
        </c:if>


    </div>
</div>



</div>
<div id="container">

<c:forEach items="${schedules}" var="schedule">
    <div class="movie">
        <div class="poster">
            <img src="<c:out value="${schedule.imageUrl}" />" />

            <div class="times">

                <c:forEach items="${schedule.times}" var="time">
                    <span class="time" ><input type="hidden" name="sid" id="sid" value="${time.id}"> <c:out value="${time.stime}" /> </span>

                </c:forEach>
            </div>
        </div>
    </div>
</c:forEach>


</div>
</body>
</html>
