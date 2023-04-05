/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra9_encuentro5;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Ejercicioextra9_encuentro5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese dos numeros para dividir");
        Integer  resultado=0,numero1=input.nextInt(),numero2=input.nextInt();
        
        while(numero1>numero2){
            numero1=numero1-numero2;
            resultado++;
        }
        System.out.println("resultado: "+resultado+"\nresto: "+numero1);
        
    }
    
}
