package boletin2_8;

import java.util.Scanner;

/**
 *
 * @author Jano
 */
public class Boletin2_8 {

    public static void main(String[] args) {
       float celsius;
       System.out.print("Introduce la temperatura en Celsius: ");
       Scanner temp= new Scanner(System.in);
       celsius=temp.nextFloat();
       System.out.println("La temperatura en Fahrenheit es: "+((celsius*9)/5)+32);
       System.out.println("La temperatura en Kelvin es: "+(celsius+273.15));
    }
    
}
