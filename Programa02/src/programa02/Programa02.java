/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa02;

import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class Programa02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre, apellido; 
        Scanner entrada = new Scanner (System.in); 
        System.out.println("Dame tu nombre: ");
        nombre=entrada.next();
        System.out.println("Dame tu apellido: ");
        apellido=entrada.next();
        System.out.println("¡¡Hola!!: \n"+nombre + " " + apellido);
    }
    
}
