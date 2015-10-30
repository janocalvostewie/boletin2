package boletin2_7;

import java.util.Scanner;

/**
 *
 * @author Jano
 */
public class Boletin2_7 {
    public static void main(String[] args) {
       float nominal, interes, tiempo, interesMensual, renta;
       System.out.print("Introduce el total del préstamo: ");
       Scanner presNominal= new Scanner(System.in);
       nominal=presNominal.nextFloat();
       System.out.print("Introduce el interés: ");
       Scanner presInteres= new Scanner(System.in);
       interes=presInteres.nextFloat();
       System.out.print("Introduce los años: ");
       Scanner presAnhos= new Scanner(System.in);
       tiempo=presAnhos.nextFloat();
       tiempo=tiempo*12;
       nominal=nominal/12;
       interes=interes/100;
       interesMensual=(float)Math.pow((1+interes),(tiempo));
       renta=(interes*nominal*interesMensual)/(interesMensual-1);
       System.out.print("El pago mensual será de: "+renta);
    }
    
}
