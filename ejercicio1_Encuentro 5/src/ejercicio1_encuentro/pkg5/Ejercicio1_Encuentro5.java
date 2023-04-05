/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_encuentro.pkg5;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Ejercicio1_Encuentro5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int numero=input.nextInt();
      
        if (numero%2==0) {
            System.out.println("El numero es par");
            
        }
      
        else{
            System.out.println("es impar");
        }
      
      
      
    }
    
}
