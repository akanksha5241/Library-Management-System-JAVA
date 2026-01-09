/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Library;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author AKANKSHA
 */
public class DBConnection {

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/library_db",
                "root",
                ""
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
