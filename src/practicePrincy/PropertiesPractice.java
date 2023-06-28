package practicePrincy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesPractice {
    public static void main(String[] args) throws IOException {
        // creating fileOutStream
        FileOutputStream fileOutputStream = new FileOutputStream("example.properties");
        // Creating a Properties instance and setting key value pair properites
        Properties properties = new Properties();
        properties.setProperty("ea", "princy");
        properties.setProperty("dbName", "mysql");
        properties.setProperty("password", "381310");
        properties.setProperty("url", "www.google.com");
        // Storing the properties int the fileOutputStream
        properties.store(fileOutputStream, null);

        // Creating a fileInput stream to read to data
        FileInputStream fileInputStream = new FileInputStream("example.properties");
        // Creating a properties instance and loading the stream data in properties
        Properties properties2 = new Properties();

        properties.load(fileInputStream);
        // Then from the loaded properties, we are retrieving the value using keys
        System.out.println(properties.get("ea"));
        System.out.println(properties.get("dbName"));
        System.out.println(properties.get("password"));
        System.out.println(properties.get("url"));

    }
}
