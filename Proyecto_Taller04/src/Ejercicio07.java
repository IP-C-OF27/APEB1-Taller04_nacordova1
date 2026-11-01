import java.util.Scanner;
/**
 * Ejercicio : "Generar un algoritmo que permita calcular y mostrar el valor a 
 * cancelar de una planilla de luz. Se debe ingresar el valor de costo por
 * kilovatio/hora y el número de kilovatios consumidos en el mes. Si el usuario 
 * tiene edad mayor a 65 años, se debe descontar el 10%."
 * @author Nicolás Córdova
 * @version 1.0
 */

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double costokilovatios;
        double kilovatiosConsumidos;
        int edad;
        double planillaLuz;
        System.out.print("Ingrese su edad: ");
        edad = tcl.nextInt();
        System.out.print("Ingresar el costo de kilovatio : ");
        costokilovatios = tcl.nextDouble();
        System.out.print("Ingrese los kilovatios consumidos en el mes: ");
        kilovatiosConsumidos = tcl.nextDouble();
        planillaLuz = (costokilovatios * kilovatiosConsumidos);
        if (edad >65) {
        planillaLuz = planillaLuz - (planillaLuz *10 / 100);     
        }
        System.out.println("EL valor a pagar es : " + planillaLuz);
                        
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese su edad: 5
Ingresar el costo de kilovatio : 5
Ingrese los kilovatios consumidos en el mes: 100
EL valor a pagar es : 500.0
BUILD SUCCESSFUL (total time: 8 seconds)
 */