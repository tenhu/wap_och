<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<html>
<head>
    <meta charset="UTF-8" />
    <title>Online movie ticketing</title>
    <link href="resources/css/main.css" type="text/css" rel="stylesheet" />
    <script type="text/javascript"
            src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="resources/js/main.js" type="text/javascript"></script>

</head>
<body>
    <div id="header" >
        <h1>Welcome to E-Movie-Ticket</h1>
        <div id="selection">
            <input type="button" id="today" value=" TODAY ">
            <input type="button" id="tomorrow" value=" TOMORROW ">
            <input type="button" id="aftertomorrow" value=" DAY AFTER TOMORROW ">
        </div>
    </div>
    <div id="container">
        <div class="movie">
            <div class="poster">
                <img src="resources/images/1.jpg" />
                <div class="times">
                    <span class="time" id="div1">10:35</span>
                    <span class="time">12:45</span>
                    <span class="time">14:10</span>
                </div>
            </div>
        </div>
        <div class="movie">
            <div class="poster">
                <img src="resources/images/2.jpg" />
                <div class="times">
                    <span class="time">11:30</span>
                    <span class="time">12:35</span>
                    <span class="time">15:00</span>
                </div>
            </div>
        </div>
        <div class="movie">
            <div class="poster">
                <img src="resources/images/3.jpg" />
                <div class="times">
                    <span class="time">13:40</span>
                    <span class="time">20:10</span>
                </div>
            </div>
        </div>
        <div class="movie">
            <div class="poster">
                <img src="resources/images/1.jpg" />
                <div class="times">
                    <span class="time">13:40</span>
                    <span class="time">20:10</span>
                </div>
            </div>
        </div>
        <div class="movie">
            <div class="poster">
                <img src="resources/images/2.jpg" />
                <div class="times">
                    <span class="time">13:40</span>
                    <span class="time">20:10</span>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
