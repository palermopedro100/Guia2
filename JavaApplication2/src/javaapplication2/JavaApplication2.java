/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double Num1,Num2,suma;
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingrese un Numero");
        Num1 = leer.nextDouble();
        
        System.out.println("Ingrese otro Numero");
        Num2 = leer.nextDouble();
        
        suma=Num1+Num2;
        
        System.out.println("La suma es: "+suma);
        System.out.println("La suma es: "+(Num1+Num2));
    }
    
}
