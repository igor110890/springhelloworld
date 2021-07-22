package jm.task.core.jdbc.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    /**
     * JDBC Driver, database url
     */
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/mydb";
    /**
     * User and Password
     */
    private static final String USER = "root";
    private static final String PASSWORD = "root";


    public Connection getConnection() {
        Connection connection = null;

        try {
            // Registering JDBC Driver
            Class.forName(JDBC_DRIVER);
            // Creating database connection
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Соединение не активно");
        }
        return connection;
    }

}

