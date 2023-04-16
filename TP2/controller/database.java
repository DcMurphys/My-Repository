package controller;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author dwicd
 */
public class database {
    
  public static Connection getDBConn() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_pasien?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC", "root", "");
            return conn;
        } catch (Exception e) {
            return null;
        }
    }
}
