/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cooperativo;

import static java.lang.Math.floor;
import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Cooperativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Primero con Entero
        Integer numero,unidad,decena,centena;
       
        
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingresar numero de tres cifras");
        
        numero=leer.nextInt();
        
        unidad=(numero)%10;
        decena= (int) ((floor(numero/10))%10);
        centena= (int) floor(numero/100);
        
        System.out.println("Unidades: " + unidad);
        System.out.println("Decenas: " + decena);
        System.out.println("Centenas: " + centena);
        
        
        
        //Ahora como String
        System.out.println("Ingresar numero de tres cifras");
        
       String numeroString;
       numeroString=leer.next();
       System.out.println("CENTENAS: " + numeroString.charAt(0));
       System.out.println("DECENAS: " + numeroString.charAt(1));
       System.out.println("UNIDADES: " + numeroString.charAt(2));
    }
    
}
