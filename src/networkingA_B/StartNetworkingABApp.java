package networkingA_B;

import networkingA_B.db.DBAccess;

import java.sql.Connection;

public class StartNetworkingABApp {
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
