# Weather-App-Real-Time-Weather-Forecast
A simple Java Servlet-based Weather Application that fetches real-time weather data using the Weatherstack API . The app allows users to enter a city name and instantly view live weather conditions, location details, and air quality information.

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h3>Features</h3>
<ol>
      <li>Search weather by city name.</li>
      <li>Displays local time of the city</li>
      <li>Shows temperature, feels-like temperature, humidity, pressure, and wind speed</li>
      <li>Weather description with icons</li>
      <li>Sunrise & Sunset timings (astro data)</li>
      <li>Air quality information (CO, NO2, PM2.5, PM10, etc.)</li>
      <li>Servlet-based backend with JSON parsing using Gson</li>
</ol>


------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
<h3>Tech Stack</h3>

<ul type ="circle">
  <li>Java (Servlets, HttpURLConnection / HttpClient)</li>
  <li>Jakarta Servlet API / Apache Tomcat</li>
  <li>JSP</li>
  <li>Gson (Google JSON Library)</li>  
  <li>Weatherstack API</li>
</ul>

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h3>How It Works</h3>
<ul type ="circle">
  <li>User enters a city name</li> 
  <li>Servlet sends a request to Weatherstack API with the city query.</li>
  <li>API responds with JSON weather data.</li>
  <li>Data is parsed using Gson and displayed in a formatted way on the web page.</li>
</ul>

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

**🚀 To Run this on your setup**

1. Clone the Repository
     git clone
   
       https://github.com/AvishkarD2023/WeatherApp.git.
       cd WeatherApp

2. Generate Your Own API Key:
    <ul type ="circle">
      <li>This project requires an API key for fetching weather data.</li>
      <li>You need to create your own API key from a weather provider: Weatherstack API(free tier available).</li>
      <li>Once you sign up, you will receive an API key.</li>
    </ul>

3. Configure Your API Key:

    Create a new file named Secret.java inside the project add your API key in apiKey variable(for easier):
   
        String apiKey = "your_api_key_here";


⚠️ Important: Do not share your API key publicly. Add Secret.java to .gitignore so it won’t be pushed to GitHub.


4. Run the Project
    <ol type="1">
      <li>If you are using Eclipse or IntelliJ IDEA</li> 
      <li>Import the project</li>
      <li>Configure Tomcat (if using Servlets)</li>
      <li>Run the app</li>
    </ol>
    
    If you are using command line:
  
        javac -cp ".;gson-2.12.1.jar" Main.java
        java -cp ".;gson-2.12.1.jar" Main
