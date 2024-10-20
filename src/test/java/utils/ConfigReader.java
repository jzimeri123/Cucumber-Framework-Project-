package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static String read(String path,String key) throws IOException {
        FileInputStream fis=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fis);
        return properties.getProperty(key);
    }
    //method overloading specifically for when we use the path constant of config properties
    public static String read(String key) throws IOException {
        return read(Constants.CONFIG_FILE_PATH, key);//calling from Constants class
    }
}
