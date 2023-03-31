/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre");
        nombre=input.nextLine();
        
        System.out.println("Su nombre es: " + nombre);
                
    }
    
}
