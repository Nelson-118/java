/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Purebas;
import Controlador.Conexion;
import java.sql.Connection;

/**
 *
 * @author Aprendiz
 */
public class PruebaConexion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    
        Conexion no = new Conexion();
        Connection conn = no.getConn();
    }
    
}
