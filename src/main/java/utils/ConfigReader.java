package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    public static String propertyReader(String filePath, String key) {
        String value = null;

        try (InputStream input = new FileInputStream(filePath)) {
            Properties prop = new Properties();
            prop.load(input);
            value = prop.getProperty(key);
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return value;
    }
}
