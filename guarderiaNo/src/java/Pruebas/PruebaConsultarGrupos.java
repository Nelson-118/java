/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pruebas;
import Modelo.Grupos;
import Controlador.GruposDAO;
import java.util.Scanner;
/**
 *
 * @author Aprendiz
 */
public class PruebaConsultarGrupos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GruposDAO miGruposDAO = new GruposDAO();
        
        Scanner mostrar = new Scanner(System.in);
        String nombreGrupo;
        System.out.println("Digite el nombre del grupo: ");
        nombreGrupo = mostrar.nextLine();
        
        Grupos miGrupos = miGruposDAO.consultarGrupos(nombreGrupo);
        
        if (miGrupos != null) {
        
        System.out.println("ID: " + miGrupos.getIdGrupos());
        System.out.println("Nombre grupo: " + miGrupos.getNombreGrupo());
        System.out.println("Cantidad: " + miGrupos.getCantidad());
        System.out.println("ID Usuario docente: " + miGrupos.getIdUsuarioDocente());
        System.out.println("ID aulas: " + miGrupos.getIdAulas());
        
            
        } else {
        
        System.out.println("No se encontro el nombre del grupo");
            
        }
    }
    
}
    
