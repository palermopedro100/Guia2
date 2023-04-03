/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_teoria;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Ejercicio6_teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner input= new Scanner(System.in);
        
       int numero1=input.nextInt();
       int  numero2=input.nextInt();
        
        if (numero1>25 && numero2>25) {
            System.out.println("ambos numeros son mayores que 25");
        }
        else if (numero1>25 || numero2>25){
            System.out.println("uno de los numeros es mayor a 25");
        }
        else{
            System.out.println("ninguno es mayor a 25");
            
        }
    }
    
}
