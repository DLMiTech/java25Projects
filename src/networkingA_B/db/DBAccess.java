package networkingA_B.db;


import java.sql.Connection;
import java.sql.DriverManager;

public class DBAccess {
    private final String USERNAME = "root";
    private final String PASSWORD = "@DLMiTech1248";
    private final String DATABASE_NAME = "key_db";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost:3306/" + DATABASE_NAME;

    private Connection connection;
    public static DBAccess dbAccess;

    public DBAccess() {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public static DBAccess getInstance() {
        if (dbAccess == null) {
            dbAccess = new DBAccess();
        }
        return dbAccess;
    }

    public Connection getConnection() {
        return connection;
    }
}
