/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Grupos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author Aprendiz
 */
public class GruposDAO {

    private Conexion conect = new Conexion();

    public Grupos consultarGrupos(String nombreGrupo) {

        Grupos miGrupos = null;

        Connection conn = conect.getConn();
        try {

            String sql = "SELECT id_grupos, nombre_grupo, cantidad, id_usuario_docente, id_aulas FROM grupos WHERE nombre_grupo = ?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nombreGrupo);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                miGrupos = new Grupos();
                miGrupos.setIdGrupos(rs.getInt("id_grupos"));
                miGrupos.setNombreGrupo(rs.getString("nombre_grupo"));
                miGrupos.setCantidad(rs.getInt("cantidad"));
                miGrupos.setIdUsuarioDocente(rs.getInt("id_usuario_docente"));
                miGrupos.setIdAulas(rs.getInt("id_aulas"));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return miGrupos;
    }
    
    public boolean insertarGrupo (Grupos miGrupos) {
    
    boolean insertar = false;
    Connection conn = conect.getConn();
    
        try {
        
            String sql = "INSERT INTO grupos (nombre_grupo, cantidad, id_usuario_docente, id_aulas) VALUES (?, ?, ?, ?)";
            
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, miGrupos.getNombreGrupo());
            ps.setInt(2, miGrupos.getCantidad());
            ps.setInt(3, miGrupos.getIdUsuarioDocente());
            ps.setInt(4, miGrupos.getIdAulas());
            
            ps.executeUpdate();
            insertar = true;
            System.out.println("Dato insertado");
        } catch (Exception e) {
                System.out.println("Error al insertar el grupo" + e.getMessage());
            }
                return insertar;
    
    }
}
