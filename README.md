# Weather-App-Real-Time-Weather-Forecast
A simple Java Servlet-based Weather Application that fetches real-time weather data using the Weatherstack API . The app allows users to enter a city name and instantly view live weather conditions, location details, and air quality information.

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h3>Features</h3>

🌍 Search weather by city name

🕒 Displays local time of the city

🌡️ Shows temperature, feels-like temperature, humidity, pressure, and wind speed

⛅ Weather description with icons

🌅 Sunrise & 🌇 sunset timings (astro data)

🫁 Air quality information (CO, NO2, PM2.5, PM10, etc.)

🖥️ Servlet-based backend with JSON parsing using Gson

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
<h3>Tech Stack</h3>

Java (Servlets, HttpURLConnection / HttpClient)

Jakarta Servlet API / Apache Tomcat

JSP

Gson (Google JSON Library)

Weatherstack API

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h3>How It Works</h3>
<ul>
<li>User enters a city name</li>
  
<li>Servlet sends a request to Weatherstack API with the city query.</li>

<li>API responds with JSON weather data.</li>

<li>Data is parsed using Gson and displayed in a formatted way on the web page.</li>
</ul>
