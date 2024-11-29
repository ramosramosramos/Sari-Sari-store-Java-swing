
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JavaConnection {
    public static Connection getConnection(){
        
        try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
            System.out.println("Connected");
            createDatabase(conn);
            useDatabase(conn);
            Database.Tables.users(conn);
            Database.Tables.items(conn);
            Database.Tables.items(conn);
  

          
           return conn;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
        
    }
    
    public static void createDatabase(Connection conn){
        try (PreparedStatement pst = conn.prepareStatement("Create database if not exists reparip")) {
            pst.execute();
            System.out.println("Database reparip cretaed");
            pst.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void useDatabase(Connection conn){
        try (PreparedStatement pst = conn.prepareStatement("use reparip")) {
            pst.execute();
            System.out.println("using reparip ");
            pst.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
