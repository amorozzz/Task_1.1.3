package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private final static String HOSTNAME = "localhost";
    private final static String DB_NAME = "user_db";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "9086878Aa";
    private static Connection conn;

    public static Connection getMySQLConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String connectionURL = "jdbc:mysql://" + HOSTNAME + ":3306/" + DB_NAME;
        conn = DriverManager.getConnection(connectionURL, USERNAME,
                PASSWORD);
        return conn;
    }

    public static void closeConnection() throws SQLException {
        conn.close();
    }

}
