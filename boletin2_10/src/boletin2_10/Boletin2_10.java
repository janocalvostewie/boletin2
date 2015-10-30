package boletin2_10;

import java.util.Scanner;

/**
 *
 * @author Jano
 */
public class Boletin2_10 {
    public static void main(String[] args) {
        int cantidad, cien, veinte, cinco, uno;
        System.out.println("Introduzca la cantidad de dinero: ");
        Scanner icantidad= new Scanner(System.in);
        cantidad=icantidad.nextInt();
        cien=cantidad/100;
        veinte=(cantidad -(100*cien))/20;
        cinco=((cantidad -(100*cien))-(20*veinte))/5;
        uno=((cantidad -(100*cien))-(20*veinte))-(5*cinco);
        System.out.println("Billetes de 100: "+cien);
        System.out.println("Billetes de 20: "+veinte);
        System.out.println("Billetes de 5: "+cinco);
        System.out.println("Monedas de 1: "+uno);
    }
    
}
