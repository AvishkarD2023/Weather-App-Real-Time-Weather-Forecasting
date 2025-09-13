
import java.io.IOException;

public class Demo{
    public static void main(String[] args) throws IOException {
        String apiKey = System.getenv("API_KEY");
        System.out.println("API Key: " + apiKey);
    }
}