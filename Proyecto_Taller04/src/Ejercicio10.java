
import java.util.Scanner;

/**
 * Ejercicio : "El programa debe calcular el área del polígono. La figura se
 compone de un cuadrado perfecto (A), tres triángulos rectángulos iguales 
 (B, C, E), cuya base mide lo mismo que uno de los lados del cuadrado, y un 
 rectángulo (D) cuyo ancho mide lo mismo que uno de los lados del cuadrado, 
 mientras que la altura mide lo mismo que la altura de los triángulos. 
 Se pide que haga un programa que calcule el área total.
 Por cultura general, sabemos que el área de un rectángulo se calcula 
 multiplicando su base por su altura; el área de un triángulo rectángulo 
 se calcula multiplicando su base por su altura, y luego dividiendo el 
 resultado entre dos; finalmente, el área de un cuadrado se calcula elevando 
 al cuadrado la medida de uno de sus lados."
 * @author Nicolás Córdova
 * @version 1.0
 */

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double lado, altura;
        double areaA, areaB, areaC, areaD, areaE;
        double areaTotal;
        System.out.print("Ingrese el lado del cuadrado: ");
        lado = tcl.nextDouble();
        System.out.print("Ingrese la altura de los triangulos: ");
        altura = tcl.nextDouble(); 
        areaA = lado * lado;
        System.out.println("Area del cuadrado A es : " + areaA);
        areaB = (lado * altura) / 2;
        System.out.println("Area del triangulo B es : " + areaB);
        areaC = (lado * altura) / 2;
        System.out.println("Area del triangulo C es : " + areaC);
        areaE = (lado * altura) / 2;
        System.out.println("Area del triangulo E es : " + areaE);
        areaD = lado * altura;
        System.out.println("Area del rectangulo D es : " + areaD);
        areaTotal = areaA + areaB + areaC + areaD + areaE;
        System.out.println("El area total es : " + areaTotal);
        
                
    }
    
}

/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del .java
 */
