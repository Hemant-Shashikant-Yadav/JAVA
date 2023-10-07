package Project.FoodWestReduction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class mysql {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://aws.connect.psdb.cloud/food-storage?sslMode=VERIFY_IDENTITY",
                    "ynbpsgmz6a2ftqs73leh",
                    "pscale_pw_mIsOkmVU2O2Mc96Ba6nwjHeBNHGieshsnqghGtKsDhi");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}