import java.util.Scanner;
/**
 * Ejercicio : "Generar un algoritmo que permita calcular y mostrar el costos de
 * una computadora de escritorio. La misma es comprada por partes; CPU, teclado,
 * pantalla, ratón."
 * @author Nicolás Córdova
 * @version 1.0
 */

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double CPU;
        double teclado;
        double pantalla;
        double raton;
        double computadora;
        System.out.print("Ingrese el valor del CPU: ");
        CPU = tcl.nextDouble();
        System.out.print("Ingrese el valor del teclado: ");
        teclado = tcl.nextDouble();
        System.out.print("Ingrese el valor de la pantalla: ");
        pantalla = tcl.nextDouble();
        System.out.print("Ingrese el valor del raton: ");
        raton = tcl.nextDouble();
        computadora = (CPU + teclado + pantalla + raton);
        System.out.println("El costo de la computadora es : " + computadora);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese el valor del CPU: 250
Ingrese el valor del teclado: 60
Ingrese el valor de la pantalla: 200
Ingrese el valor del raton: 25
El costo de la computadora es : 535.0
BUILD SUCCESSFUL (total time: 15 seconds)

 */