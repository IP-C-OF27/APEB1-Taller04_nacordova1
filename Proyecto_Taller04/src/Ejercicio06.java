import java.util.Scanner;
/**
 * Ejercicio : "Generar un solución que permita calcular y mostrar el pago 
 * mensual de un préstamo de 1 año de plazo. Se debe ingresar el monto del 
 * préstamo y el interés mensual a cobrar."
 * @author Nicolás Córdova
 * @version 1.0
 */

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double prestamo;
        double interesMensual;
        double pagoMensual;
        System.out.print("Ingresar el valor del prestamo: ");
        prestamo = tcl.nextDouble();
        System.out.print("Ingresar el interes mensual: ");
        interesMensual = tcl.nextDouble();
        pagoMensual = (prestamo + (prestamo * interesMensual / 100) * 12) / 12;
        System.out.println("EL pago mensual es : " + pagoMensual);     
    } 
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Ingresar el valor del prestamo: 1500
Ingresar el interes mensual: 2
EL pago mensual es : 155.0
BUILD SUCCESSFUL (total time: 4 seconds)
 */
