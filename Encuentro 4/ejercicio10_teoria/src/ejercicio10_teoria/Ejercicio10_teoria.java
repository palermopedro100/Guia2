/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10_teoria;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Ejercicio10_teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        int n1;
        
        
   	System.out.println("Ingrese  4un numero natural");
        
        for (int j = 0; j < 4; j++) {
             n1=input.nextInt();
            System.out.print(n1);
            for (int i = 0; i < n1; i++) {
            System.out.print("*");
   
    	}
        System.out.println("");
        }
        
   	 
    
}
    }
    
    

