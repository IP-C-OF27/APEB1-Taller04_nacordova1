import java.util.Scanner;
/**
 * Ejercicio : "Generar un algoritmo que permita calcular y mostrar el valor de 
 * la planilla de teléfono de un casa. Se debe ingresar el costo por minutos, 
 * el número de minutos consumidos en el mes."
 * @author Nicolás Córdova
 * @version 1.0
 */

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double minutosConsumidos;
        double costoMinutos;
        double valorPlanilla;
        System.out.print("Ingrese el numero de minutos consumidos en el mes: ");
        minutosConsumidos = tcl.nextDouble();
        System.out.print("Ingrese el costo por minutos: ");
        costoMinutos = tcl.nextDouble();
        valorPlanilla = (costoMinutos * minutosConsumidos);
        System.out.println("EL valor de planilla es : " + valorPlanilla);
    }  
}

/***
 * EVIDENCIA DEL RUN:
 * Ingrese el numero de minutos consumidos en el mes: 500
Ingrese el costo por minutos: 59
EL valor de planilla es : 29500.0
BUILD SUCCESSFUL (total time: 9 seconds)
 */