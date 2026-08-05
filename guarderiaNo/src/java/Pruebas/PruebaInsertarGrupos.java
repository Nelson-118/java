/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pruebas;

import Controlador.GruposDAO;
import Modelo.Grupos;
import java.util.Scanner;

/**
 *
 * @author Aprendiz
 */
public class PruebaInsertarGrupos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Grupos miGrupos = new Grupos();
        GruposDAO dao = new GruposDAO();
        
        System.out.println("ingrese el nombre del grupo: ");
        miGrupos.setNombreGrupo(sc.nextLine());
        System.out.println("ingrese la cantidad de niños: ");
        miGrupos.setCantidad(sc.nextInt());
        System.out.println("ingrese el ID del docente: ");
        miGrupos.setIdUsuarioDocente(sc.nextInt());
        System.out.println("ingrese el ID del aula: ");
        miGrupos.setIdAulas(sc.nextInt());
        
        boolean resultado = dao.insertarGrupo(miGrupos);
        if(resultado){
            System.out.println("El grupo se añadio correctamente");
        } else {
            System.out.println("El grupo no se pudo añadir");
        }
    }
    
}
