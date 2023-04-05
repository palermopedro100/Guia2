

package guia3_ej3;

import java.util.Scanner;

public class Guia3_ej3 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
  
        System.out.println("ingrese una frase");
        String frase= leer.next();
        
        if (frase.length()==8){
            System.out.println("correcto");
        }
        else {
            System.out.println("incorrecto");
        }
    }
    
}