package boletin2_11y12;

import java.util.Scanner;

public class Boletin2_11y12 {
    public static void main(String[] args) {
        float importeVentas, dias, km, sFijo, irpf, sLiquido, sFinal;
        System.out.println("Introduzca el sueldo fijo: ");
        Scanner vSueldoFijo= new Scanner(System.in);
       //System.out.print(System.getProperty("line.separator"));
        sFijo=vSueldoFijo.nextFloat();
        System.out.println("Introduzca el importe total de ventas: ");
        Scanner vImporteVentas= new Scanner(System.in);
        importeVentas=vImporteVentas.nextFloat();
        System.out.println("Introduzca los kilómetros: ");
        Scanner vKm= new Scanner(System.in);
        km=vKm.nextFloat();
        System.out.println("Introduzca los días de desplazamiento: ");
        Scanner vDias= new Scanner(System.in);
        dias=vDias.nextFloat();
        importeVentas=(importeVentas*5)/100;
        km=km*2;
        dias=dias*30;
        sLiquido=sFijo+km+dias+importeVentas;
        System.out.println("Sueldo líquido: "+sLiquido);
        irpf=(sLiquido*18)/100;
        sFinal=(sLiquido-irpf)-36;
        System.out.println("Sueldo final: "+sFinal);
        
    }
    
}
