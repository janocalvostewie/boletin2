package boletin2_4;

import java.util.Scanner;

/**
 *
 * @author Jano
 */
public class Boletin2_4 {

    public static void main(String[] args) {
        float numero1, numero2;
        System.out.print("Teclea el primer número:");
        Scanner num1= new Scanner(System.in);
        numero1=num1.nextFloat();
        System.out.print("Teclea el segundo número:");
        Scanner num2= new Scanner(System.in);
        numero2=num2.nextFloat();
        float resultado=numero1-numero2;
        System.out.println("La suma de: "+numero1+"+"+numero2+"="+numero1+numero2);
        System.out.println("El producto de: "+numero1+"*"+numero2+"="+numero1*numero2);
        System.out.println("El cociente de: "+numero1+"/"+numero2+"="+numero1/numero2);
        System.out.println("La resta es de : "+numero1+"-"+numero2+"="+resultado);
            
    }
    
}
