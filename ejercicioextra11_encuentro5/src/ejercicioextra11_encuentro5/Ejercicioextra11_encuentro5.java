/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra11_encuentro5;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Ejercicioextra11_encuentro5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
       Integer i=1, numero=input.nextInt();
        
       while(Math.abs(numero)>9){
           numero=numero/10;
           i++;
       }
        System.out.println("cantidad de digitos: "+i);
        
    }
    
}
