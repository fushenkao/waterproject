/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterproject;

/**
 *
 * @author lasitha atapattu <lasithaatapattu18@gmail.com>
 */
import java.sql.*;

public class DBconnection {

   public Connection con;

    public Connection createconnection() {
        try {
            String path = "jdbc:mysql://localhost/waterproject";
            con = DriverManager.getConnection(path, "root", "");
        } catch (SQLException e) {
            System.out.println("e.getMessage()");
        }
        return con;

    }

}
