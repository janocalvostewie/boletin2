package boletin2_9;

import java.util.Scanner;

/**
 *
 * @author Jano
 */
public class Boletin2_9 {
    public static void main(String[] args) {
       int cien, veinte, cinco, uno, cantidadTotal;
        System.out.print("Introduce la cantidad de billetes de 100: ");
        Scanner billetesCien= new Scanner(System.in);
        cien=billetesCien.nextInt();
        System.out.print("Introduce la cantidad de billetes de 20: ");
        Scanner billetesVeinte= new Scanner(System.in);
        veinte=billetesVeinte.nextInt();
        System.out.print("Introduce la cantidad de billetes de 5: ");
        Scanner billetesCinco= new Scanner(System.in);
        cinco=billetesCinco.nextInt();
        System.out.print("Introduce la cantidad de monedas de 1: ");
        Scanner billetesUno= new Scanner(System.in);
        uno=billetesUno.nextInt();
        cien=cien*100;
        veinte=veinte*20;
        cinco=cinco*5;
        cantidadTotal=cien+veinte+cinco+uno;
        System.out.print("La cantidad total es de: "+cantidadTotal+" de euros");
    }
    
}
