package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {

    private static Properties properties = new Properties();


    static{

        String path = "configuration.properties";

        try{
            FileInputStream fileInputStream = new FileInputStream(path);
            properties.load(fileInputStream);
            fileInputStream.close();

        }catch (IOException e){
            e.printStackTrace();
            System.out.println("File not found!");

        }
    }

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }
}
