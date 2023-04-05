/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercico3_encuentro.pkg5;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Ejercico3_Encuentro5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String frase=input.nextLine();
        
        
       Integer longitud=frase.length();
        
        if (longitud==8) {
            System.out.println("correcto");
            
        }
        else{
            System.out.println("incorrecto");
        }
        
        
        
    }
    
}
