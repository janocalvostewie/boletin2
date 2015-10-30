package boletin2_3;

import java.util.Scanner;

/**
 *
 * @author Jano
 */
public class Boletin2_3 {

    public static void main(String[] args) {
        //Declaramos las variables que se van a emplear
        float cEuros, cambio;
        Scanner dinero= new Scanner(System.in);
        Scanner cCambio= new Scanner(System.in);
        System.out.println("Teclea la cantidad de euros:");
        cEuros=dinero.nextFloat();
        System.out.println("Teclea el cambio:");
        cambio=cCambio.nextFloat();
        System.out.println("La cantidad en euros "+cEuros+" son "+cambio*cEuros+" dólares");
    }
    
}
