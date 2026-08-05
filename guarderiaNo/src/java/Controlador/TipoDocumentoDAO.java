/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.TipoDocumento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
/**
 *
 * @author Aprendiz
 */
public class TipoDocumentoDAO {
    private Conexion conect = new Conexion();
    
    public TipoDocumento consultarTipoDocumento (String descripcionTipo){
    
        TipoDocumento miTipo = null;
        
        Connection conn = conect.getConn();
            try {
                String querySql = "SELECT id_tipo_documento, descripcion_tipo FROM tipo_documento WHERE descripcion_tipo = ?";
                
                PreparedStatement ps = conn.prepareStatement(querySql);
                
                ps.setString(1, descripcionTipo);
                
                ResultSet rs = ps.executeQuery();
                
                if (rs.next()) {
                    
                miTipo = new TipoDocumento();
                miTipo.setIdTipoDocumento(rs.getInt("id_tipo_documento"));
                miTipo.setDescripcionTipo(rs.getString("descripcion_tipo"));
                }
            } catch (SQLException e) {
                
              System.out.println(e.getMessage());
              
              
            }
            return miTipo;
       
    }
    
}
