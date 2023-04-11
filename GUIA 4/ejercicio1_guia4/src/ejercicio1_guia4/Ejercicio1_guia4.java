/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_guia4;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Ejercicio1_guia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        double numero1=input.nextInt(), numero2=input.nextInt();
        
        System.out.println("que operacion quiere hacer: \n1- sumar\n2- restar"
                + "\n3- multiplicar\n4- dividir");
        int respuesta=input.nextInt();
        
        switch (respuesta){
            case 1:
                System.out.println("La suma es: "+sumar(numero1,numero2));
                break;
                case 2:
                System.out.println("La resta es: "+restar(numero1,numero2));
                break;
                case 3:
                System.out.println("La multiplicacion es: "+multiplicar(numero1,numero2));
                break;
                case 4:
                System.out.println("La division es: "+dividir(numero1,numero2));
                break;
                
                default:
                    System.out.println("opcion no valida");
        }
        
    }
    
    public static double sumar(double a, double b){
        
        return a+b;
    }
    
    public static double restar(double a, double b){
        
        return a-b;
    }
    public static double multiplicar(double a, double b){
        
        return a*b;
    }
    public static double dividir(double a, double b){
        
        return a/b;
    }
    
}
