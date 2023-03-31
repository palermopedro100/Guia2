/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer numero;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero");
        numero=input.nextInt();
        
        System.out.println("eL DOBLE es: " +(2*numero));
        System.out.println("eL triple es: " +(3*numero));
        System.out.println("La raiz cuadrada es: " +(Math.sqrt(numero)));
    }
    
    }
    

