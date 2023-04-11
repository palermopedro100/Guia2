/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11_teoria_guia4;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Ejercicio11_teoria_guia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = input.next();
        
        
        System.out.println("la frase final es: "+sustitucion(frase));
    }
    
    public static String sustitucion(String frase){
        String frase2="";
        for (int i = 0; i < frase.length(); i++) {
            String letra=frase.substring(i,i+1);
            
            switch (letra){
                case "a":
                    letra="@";
                    break;
                case "e":
                    letra="#";
                    break;
                case "i":
                    letra="$";
                break;
                case "o":
                    letra="%";
                break;
                case "u":
                    letra="*";
                break;
                //default:
                   // letra=letra;
                    
            }
            frase2=frase2+letra;
            
        }
        return frase2;
    }
    
}
