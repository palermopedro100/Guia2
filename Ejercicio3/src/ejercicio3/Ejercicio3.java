/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Pedro
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        frase=input.nextLine();
        
        System.out.println(toUpperCase(frase));
        System.out.println(toLowerCase(frase));
        System.out.println(frase.toLowerCase());
    }
    
}
