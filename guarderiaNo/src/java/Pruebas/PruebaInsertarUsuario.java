/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pruebas;

import Controlador.UsuarioDAO;
import Modelo.Usuario;
import java.util.Scanner;

/**
 *
 * @author Aprendiz
 */
public class PruebaInsertarUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Usuario miUsuario = new Usuario();
        UsuarioDAO dao = new UsuarioDAO();

        System.out.println("por favor ingrese su nombre: ");
        miUsuario.setNombre(sc.nextLine());
        System.out.println("por favor ingrese su apellido: ");
        miUsuario.setApellido(sc.nextLine());
        System.out.println("por favor ingrese su numero de documento: ");
        miUsuario.setNumeroDocumento(sc.nextLine());
        System.out.println("por favor ingrese su numero de telefono: ");
        miUsuario.setTelefono(sc.nextLine());
        System.out.println("por favor ingrese su correo: ");
        miUsuario.setCorreo(sc.nextLine());
        System.out.println("por favor ingrese su contraseña: ");
        miUsuario.setContrasena(sc.nextLine());
        System.out.println("por favor ingrese un ID para el tipo de documento: ");
        miUsuario.setTipoDocumentoIdTipoDocumento(sc.nextInt());
        System.out.println("por favor ingrese in ID para el rol: ");
        miUsuario.setIdRol(sc.nextInt());

        boolean resultado = dao.insertarUsuario(miUsuario);
        if (resultado) {
            System.out.println("El usuario se guardo correctamente");
        } else {
            System.out.println("El usuario no se pudo registrar");
        }
    }

}
