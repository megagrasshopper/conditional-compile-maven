package ru.strike;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ProfileUtil {

    private static final Properties properties = new Properties();

    static {
        InputStream is = Main.class.getClassLoader().getResourceAsStream("application.properties");
        try {
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProfile() {
        return properties.getProperty("maven.profile");
    }

}
