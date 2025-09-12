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
🔹Tech Stack

Java (Servlets, HttpURLConnection / HttpClient)

Jakarta Servlet API / Apache Tomcat

JSP

Gson (Google JSON Library)

Weatherstack API

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

🔹 How It Works

User enters a city name.

Servlet sends a request to Weatherstack API with the city query.

API responds with JSON weather data.

Data is parsed using Gson and displayed in a formatted way on the web page.
