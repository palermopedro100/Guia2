/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7_encuentro5;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Ejercicio7_encuentro5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String cadena=null;
        Integer correctas=0,incorrectas=0;
        
        do {
            System.out.println("ingrese una cadena");
            cadena=input.next();
            if ((cadena.length()<6)&&(cadena.substring(0,1).equals("X"))&&(cadena.substring(cadena.length()-1,cadena.length()).equals("O"))) {
                correctas++;
            }
            else if(cadena.equals("&&&&&")){
                break;}
            else{
                incorrectas++;
            }
            
        } while (!cadena.equals("&&&&&"));
        System.out.println("cantidad de correctas: "+correctas+"\n"+"cantidad de incorrectas: "+incorrectas);
        
    }
    
}
