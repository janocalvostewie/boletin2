package boletin2_1;

import java.util.Scanner;

/**
 *
 * @author Jano
 */
public class Boletin2_1 {

    public static void main(String[] args) {
        /*//Inicialización de las variables marcando el tipo
        float area, base=2.0F;
        //Mediante operación de 'casting'
        float altura=(float)3.5;
        //Procedimiento de cálculo del área
        area=(base*altura)/2;
        //Mostrar por pantalla
        System.out.println("El área de este triángulo es de : "+area);
        //Si se quiere simplificar el programa para ahorrar código
        //podemos simplificar la operación dentro del comando de mostrar
        //nos ahorraríamos declarar una variable y líneas de código*/
        float base, altura;
        System.out.println("Introduce la base: ");
        Scanner medidab= new Scanner(System.in);
        base=medidab.nextFloat();
        System.out.println("Introduce la altura: ");
        Scanner medidaa= new Scanner(System.in);
        altura=medidaa.nextFloat();
        System.out.println("El área es: "+(base*altura)/2);
        
    }
    
}
