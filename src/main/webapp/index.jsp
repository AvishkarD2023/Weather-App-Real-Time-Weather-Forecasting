<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Weather App</title>
     <link rel="stylesheet" href="style.css" />
     <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" />
</head> 
<body>
	
	<div class="mainContainer">
	
	<div class="weatherIcon">
	<img src="Images/atmospheric-conditions.png" alt="Weather Logo">
	</div>
	
	<h1 style="text-align:center; color:#1b1a1ac9;">Weather Application</h1>
    <h3 style="text-align:center; color:#1b1a1ac9;">Made by @Avishkar Daundkar</h3>
    
    <form action="MyServlet" method="get" class="searchInput">
    	<input type="text" placeholder="Enter City Name" name="city" value="<%= request.getAttribute("city") != null ? request.getAttribute("city") : "" %>" />
        <button><i class="fa-solid fa-magnifying-glass"></i></button>
    </form>


    <%
        String city = (String) request.getAttribute("city");
        String date = (String) request.getAttribute("date");
        String state = (String) request.getAttribute("state");
        String country = (String) request.getAttribute("Country");
        String temp = (String) request.getAttribute("temperature");
        String weather = (String) request.getAttribute("weather_descriptions");
        String humidity = (String) request.getAttribute("humidity");
        String wind = (String) request.getAttribute("wind_speed");
    
    %>


    <% if(city != null) { %>
        <div class="cityDetails">
            <h3><%= city %>, <%= state %>, <%= country %></h3>
            <div class="date"><%= date %></div>
        </div>

        <div class="weatherDetails">
            <div class="temp"><%= temp %>°C</div>
            <div style="font-size:1.2rem;"><%= weather %></div>
        </div>

        <div class="windDetails">
            <div class="humidityBox">
                <img src="Images/humidity.png" alt="Humidity">
                <div class="humidity">
                    <div class="humidityValue"><%= humidity %>%</div>
                    <div>Humidity</div>
                </div>
            </div>

            <div class="windSpeed">
                <img src="Images/wind.png" alt="Wind">
                <div>
                    <div style="font-size:1.5rem;"><%= wind %> km/h</div>
                    <div>Wind Speed</div>
                </div>
            </div>
        </div>

        <!-- Hidden input to hold weather condition -->
        <input type="hidden" id="wc" value="<%= weather %>" />

    <% } else { %>
        <p style="text-align:center; color:#999;">Enter a city to check the weather.</p>
    <% } %>

    
	</div>


<script src="script.js"></script>
</body>
</html>