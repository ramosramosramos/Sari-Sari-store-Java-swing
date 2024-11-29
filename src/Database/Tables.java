package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Tables {

    public static void users(Connection conn) {
        String query = ""
                + "Create table if not exists users("
                + "id int primary key auto_increment,"
                + "username varchar(255) unique,"
                + "name varchar(255),"
                + "password varchar(255)"
                + " )";

        try (PreparedStatement pst = conn.prepareStatement(query)) {
            pst.executeUpdate();
            System.out.println("Users table created successfully (if not already present).");
        } catch (Exception e) {
            System.err.println("Error creating users table: " + e.getMessage());
        }
    }

    public static void items(Connection conn) {
        String query = ""
                + "Create table if not exists items("
                + "id int primary key auto_increment,"
                + "name varchar(255),"
                + "price varchar(255),"
                + "tax  decimal(10,2)"
                + " )";

        try (PreparedStatement pst = conn.prepareStatement(query)) {
            pst.executeUpdate();
            System.out.println("items table created successfully (if not already present).");
        } catch (Exception e) {
            System.err.println("Error creating items table: " + e.getMessage());
        }
    }


}
