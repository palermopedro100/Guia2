/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_encuentro5;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Ejercicio5_encuentro5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese el numero limite");
        Integer suma=0,limite = input.nextInt();
        
        while(suma<limite){
            System.out.println("ingrese un numero");
            suma+=input.nextInt();
            
        }
        System.out.println("limite superado. La suma es: "+ suma);
   
    }
    
}
