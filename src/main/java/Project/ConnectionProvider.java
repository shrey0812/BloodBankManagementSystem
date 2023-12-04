/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;

/**
 *
 * @author HP
 */
public class ConnectionProvider {
    
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms","root","5CTyAB678.");
            if (con != null) {
    System.out.println("Connection established successfully!");
} else {
    System.out.println("Failed to establish connection!");
}
            return con;
        }
        catch(Exception e){
            return null;
        }
    }
}
