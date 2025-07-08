import networkingC_D.db.DBAccess;

import java.sql.Connection;

public class StartNetworkingCDApp {
    public static void main(String[] args) {
        DBAccess db = new DBAccess();
        Connection connection = db.getConnection();

        if (connection != null) {
            System.out.println("Connected to the database");
        }else {
            System.out.println("Connection Failed!!!");
        }
    }
}
