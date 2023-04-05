
package guia3_ej2;

import java.util.Scanner;

public class Guia3_ej2 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
  
        System.out.println("ingrese una frase");
        String frase= leer.next();
        
        if (frase.equals("eureka")) {
            System.out.println("correcto");
        }
        else {
            System.out.println("incorrecto");
        }
    }
    
}
