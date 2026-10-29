import java.util.Scanner;
/**
 * Ejercicio : "Generar un algoritmo que permite calcular y presentar el área de
 * un triángulo. Los datos deben ser pedidos al usuario."
 * @author Nicolás Córdova
 * @version 1.0
 */

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double base, altura , area;
        System.out.print("Deme base: ");
        base = tcl.nextDouble();
        System.out.print("Deme altura: ");
        altura = tcl.nextDouble();
        area = (base * altura) / 2;
        System.out.println("Area : " + area);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Deme base: 7
Deme altura: 3
Area : 10.5
BUILD SUCCESSFUL (total time: 3 seconds)
 */