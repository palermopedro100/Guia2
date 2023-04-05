/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_encuentro5;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Ejercicio4_encuentro5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        String frase=input.nextLine();
        
        
        if (frase.substring(0,1).equalsIgnoreCase("a")) {
            System.out.println("correcto");
            
        }
        else{
            System.out.println("incorrecto");
        }
        //System.out.println(frase.charAt(0));
       
    }
    
}
