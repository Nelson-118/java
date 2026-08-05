/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pruebas;
import Modelo.TipoDocumento;
import Controlador.TipoDocumentoDAO;
import java.util.Scanner;

/**
 *
 * @author Aprendiz
 */
public class PruebaConsultaTipoDocumento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TipoDocumentoDAO miTipoDAO = new TipoDocumentoDAO();
        
        Scanner mostrar = new Scanner(System.in);
        String descripcionTipo;
        System.out.println("Digite el tipo de documento: ");
        descripcionTipo = mostrar.nextLine();
        
        TipoDocumento miTipo = miTipoDAO.consultarTipoDocumento(descripcionTipo);
        
        if (miTipo != null) {
        
        System.out.println("ID: " + miTipo.getIdTipoDocumento());
        System.out.println("Descripcion: " + miTipo.getDescripcionTipo());
        
            
        } else {
        
        System.out.println("No se encontro el tipo de documento");
            
        }
    }
    
}
