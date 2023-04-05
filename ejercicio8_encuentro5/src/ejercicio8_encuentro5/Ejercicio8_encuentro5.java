/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8_encuentro5;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Ejercicio8_encuentro5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
         System.out.println("ingrese la longitud del lado del cuadrado");
         Integer N=input.nextInt();
         
         
         for (int i = 0; i < N; i++) {
             for (int j = 0; j < N; j++) {
                 if (i==0||i==N-1||j==0||j==N-1) {
                     System.out.print("* ");
                 }
                 else{
                     System.out.print("  ");
                 }
                 
             }
             System.out.println("");
        }
         
    }
    
}
