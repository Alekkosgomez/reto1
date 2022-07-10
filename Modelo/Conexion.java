/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    Connection connection ;
     String driver = "com.mysql.cj.mysqljdbc.Driver";
     String user = "root";
     String password = ""; 
     String urlConexion =  "jdbc:mysql://localhost:3306/reto1_g54_db ";    

    public Conexion() {
        try {
            Class.forName(driver);
            connection = (Connection) DriverManager.getConnection(urlConexion,user,password);
            if(connection != null){
                System.out.println("Conexion exitosa con la base de datos");
                
            }
        
        
        } catch (ClassNotFoundException | SQLException e){
            System.out.println("Error en la conexion"+ e );
     }
     } 
    public Connection getConnection (){
     return connection ;
}      
}
        
            
       
    
    
    
   

