/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_guia4;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Ejercicio2_guia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        
        
        String nombre,respuesta;
        int edad;
        
        do {
            System.out.println("Ingrese nombre y edad de la persona");
            nombre=input.next();
            edad=input.nextInt();
            
            
            
            
            mprimir(nombre,edad,EsMayor(nombre,edad));
            
            System.out.println("desea seguir ingresando personas?: ");
            respuesta=input.next();
        } while (!respuesta.equalsIgnoreCase("no"));
        
        
        
    }
    
    public static boolean EsMayor(String nombre,int edad){
        boolean retorno;
        retorno=edad>=18;
        
    return retorno;
    }
    public static void mprimir(String nombre,int edad, boolean mayoriaDeEdad){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ edad);
        System.out.println("Es mayor????: "+mayoriaDeEdad);
        

}
    
}
