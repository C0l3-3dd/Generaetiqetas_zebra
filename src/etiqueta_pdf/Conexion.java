/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etiqueta_pdf;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author edd_g
 */
public class Conexion {
    public static final String URL = "jdbc:mysql://localhost:3306/empresas_csp";
    public static final String USER = "root";
    public static final String CLAVE = "";
    
    
    public Connection getConnection()
    {
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con =  DriverManager.getConnection(URL, USER, CLAVE);
        }catch(Exception e )
        {
            System.out.println("Error: " + e.getMessage()+" Conexion.java");
        }
        return con;
    }
}
