

import computerScience.db.DBAccess;

import java.sql.Connection;

public class StartCompSciApp {
    public static void main(String[] args) {
        DBAccess db = new DBAccess();
        Connection connection = db.getConnection();

        if (connection != null) {
            System.out.println("Connection successful");
        }else {
            System.out.println("Connection failed");
        }
    }
}
