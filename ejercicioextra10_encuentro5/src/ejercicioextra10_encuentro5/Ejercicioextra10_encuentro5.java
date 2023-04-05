/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra10_encuentro5;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Ejercicioextra10_encuentro5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        
        
       Integer intento, numero=(int) ((Math.random()*11)*(Math.random()*11));

       
        do {
            System.out.println("ADIVINE");
            intento=input.nextInt();
            
        } while (!Objects.equals(intento, numero));
        System.out.println("bieeeeeeeeeeeem");
      System.out.println(numero);
    }
    
}
