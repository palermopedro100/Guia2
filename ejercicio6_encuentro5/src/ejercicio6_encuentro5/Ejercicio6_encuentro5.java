/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_encuentro5;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Ejercicio6_encuentro5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese dos numeros enteros positivos");
        Integer entrada,numero1=input.nextInt(),numero2=input.nextInt();
        String x="n";
        
        do {
            System.out.println("1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir");
          entrada=input.nextInt();
           switch(entrada){
               case 1:
                   System.out.println("La suma de los valores es: "+(numero1+numero2));
                   break;
               case 2:
                   System.out.println("La resta de los valores es: "+(numero1-numero2));
                break;
               case 3:
                   System.out.println("La multiplicacion de los valores es: "+(numero1*numero2));
                   break;
               case 4:
                   System.out.println("La division de los valores es: "+(numero1/numero2));
                   break;
               case 5:
                   System.out.println("estas seguro de que deseas salir del programa: (s/n)");
                   x=input.next();
                   while(!x.equalsIgnoreCase("n")&&!x.equalsIgnoreCase("s")){
                       System.out.println("opcion no valida, intente nuevamente");
                       x=input.next();
                   }
                   
               break;
               default:
                   System.out.println("Opcion no valida");
           }
            
        } while (x.equalsIgnoreCase("n"));
        
        
        
    }
    
}
