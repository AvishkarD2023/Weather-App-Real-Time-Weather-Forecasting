

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;


import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		
		String city = request.getParameter("city");
		String apiKey = "1f211132206d8e2d5980b5ee04d8f61d";
		
		String apiUrl = "http://api.weatherstack.com/current?access_key=" +apiKey+ "&query="+city;

		//api integration
//		URL url = new URL(apiUrl);
		URI uri = URI.create(apiUrl);  // safely creates a URI
		URL url = uri.toURL();         // then convert to URL

		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		
		//reading data
		InputStream inputStream = conn.getInputStream();
		InputStreamReader reader = new InputStreamReader(inputStream);
		
		StringBuilder responseContent = new StringBuilder();
		
		Scanner scanner = new Scanner(reader);
		
		while(scanner.hasNext()) {
			responseContent.append(scanner.nextLine());
		}
		scanner.close();
		

		Gson gson = new Gson();
		JsonObject jsonObj = gson.fromJson(responseContent.toString(),JsonObject.class);
		
		
		//get date time 
		JsonObject loc = jsonObj.getAsJsonObject("location");
		String localtime = loc.get("localtime").getAsString();
		String cityname = loc.get("name").getAsString();
		String state = loc.get("region").getAsString();
		String country = loc.get("country").getAsString();
		
		JsonObject current = jsonObj.getAsJsonObject("current");
		String weather_descriptions = current.get("weather_descriptions").getAsString();
		String wind_speed = current.get("wind_speed").getAsString();
		String humidity = current.get("humidity").getAsString();
		String temperature = current.get("feelslike").getAsString();
		
		// Set the data as request attributes (for sending to the jsp page)
        request.setAttribute("city", cityname);
		request.setAttribute("date", localtime);
        request.setAttribute("state", state);
        request.setAttribute("Country", country);

        request.setAttribute("temperature", temperature);
        request.setAttribute("weather_descriptions", weather_descriptions); 
        request.setAttribute("humidity", humidity);    
        request.setAttribute("wind_speed",wind_speed);
        request.setAttribute("weatherData", responseContent.toString());

        conn.disconnect();
        
	
     request.getRequestDispatcher("index.jsp").forward(request, response);   
	}
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
