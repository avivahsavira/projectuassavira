/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud_daspro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author avivah savira
 */
public class Koneksi {

    private final String driverName = "com.mysql.jdbc.Driver";
    private final String url = "jdbc:mysql://localhost/crud_daspro";
    private final String username = "root";
    private final String password = "";

    public Connection getKoneksi() {
        Connection connect = null;
        try {
            Class.forName(driverName);
            System.out.println("Class driver ditemukan");

            connect = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.toString());
//            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }

        return connect;
    }

}
