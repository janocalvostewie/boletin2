
package boletin2_5;

import java.util.Scanner;

/**
 *
 * @author Jano
 */
public class Boletin2_5 {

    public static void main(String[] args) {
        float distancia;
        float vMilla=1.818f;
        System.out.print("Inserta millas náuticas: ");
        Scanner milla= new Scanner(System.in);
        distancia=milla.nextFloat();
        System.out.println("La distancia en metros son: "+distancia*vMilla);
    }
    
}
