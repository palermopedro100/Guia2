/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12_teoria_guia4;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Ejercicio12_teoria_guia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int numero1=input.nextInt(), numero2=input.nextInt();
        
        EsMultiplo(numero1);
        
        
        
    }
    
    public static void EsMultiplo(int a,int b){
        
        if (b%a==0) {
            System.out.println("es");
        }
        else{
            System.out.println("no es");
        }
        
    }
    
}
