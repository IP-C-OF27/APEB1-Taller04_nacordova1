import java.util.Scanner;
/**
 * Ejercicio : "Generar un algoritmo que permite ingresar los gastos de tres 
 * hijos de un padre de familia; calcular y mostrar el total de gastos de los 
 * hijos del padre de familia."
 * @author Nicolás Córdova
 * @version 1.0
 */

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double hijo1 , hijo2 , hijo3 , gastoTotal;
        System.out.print("Ingrese los gastos: ");
        hijo1 = tcl.nextDouble();
        hijo2 = tcl.nextDouble();
        hijo3 = tcl.nextDouble();     
        gastoTotal = hijo1 + hijo2 + hijo3;
        System.out.println("El total de gastos es: " + gastoTotal);
     
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese los gastos: 500
200
100
El total de gastos es: 800.0
BUILD SUCCESSFUL (total time: 6 seconds)
 */