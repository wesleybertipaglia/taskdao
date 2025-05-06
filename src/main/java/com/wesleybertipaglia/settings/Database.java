package com.wesleybertipaglia.settings;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Database {
    private static final String PROPERTIES_FILE = "/application.properties";
    private static final Properties props = new Properties();

    static {
        try (InputStream input = Database.class.getResourceAsStream(PROPERTIES_FILE)) {
            if (input == null) {
                throw new RuntimeException("Not Found: " + PROPERTIES_FILE);
            }
            props.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Error: " + e.getMessage(), e);
        }
    }

    public static Connection getConnection() throws SQLException {
        String url = props.getProperty("db.url");
        String user = props.getProperty("db.user");
        String password = props.getProperty("db.password");

        return DriverManager.getConnection(url, user, password);
    }
}