package utils;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class jsonReader {
    
    // Method with parameter for any JSON file
    public static JSONObject getJsonData(String filePath) {
        JSONParser parser = new JSONParser();
        try {
            // Path relative to src/test/resources
            InputStream input = jsonReader.class.getClassLoader()
                    .getResourceAsStream(filePath);
            if (input == null) {
                System.out.println("File not found! Check the path: " + filePath);
                return null;
            }
            return (JSONObject) parser.parse(new InputStreamReader(input, "UTF-8"));
        } catch (Exception e) {
            System.out.println("Error reading JSON: " + e.getMessage());
            return null;
        }
    }
}