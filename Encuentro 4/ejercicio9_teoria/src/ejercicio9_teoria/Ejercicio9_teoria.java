/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9_teoria;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Ejercicio9_teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int numero,suma=0,i=0;
        while (i<3){
            System.out.println("Ingrese un numero entero");
            numero=input.nextInt();
            if (numero>0){
               suma=suma+numero; 
            }
            if(numero==0){
                System.out.println("hemos capurado el 0");
                break;
            }
            
            i++;
            System.out.println(i);
        }
        System.out.println(suma);
    }
    
}
