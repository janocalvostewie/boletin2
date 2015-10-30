package boletin2_6;

import java.util.Scanner;

/**
 *
 * @author Jano
 */
public class Boletin2_6 {

    public static void main(String[] args) {
       //Crear variables que se emplearán
       float pPagado, pTarifa, diferencia,porcentaje;
       int porcentaje2;
       System.out.print("Introduce el precio de la tarifa: ");
       //Creación del nuevo objeto tipo Scanner
       Scanner tarifa= new Scanner(System.in);
       //Pasar dato obtenido a un tipo operable
       pTarifa=tarifa.nextFloat();
       System.out.print("Introduce el precio pagado: ");
       Scanner pagado= new Scanner(System.in);
       pPagado=pagado.nextFloat();
       diferencia=pTarifa-pPagado;
       porcentaje=100*diferencia/pTarifa;
       //operación de casting para que el porcentaje salga sin decimales
       porcentaje2=(int)porcentaje;
       System.out.println("El descuento que te has llevado es de : "+porcentaje2+"%");
    }
    
}
