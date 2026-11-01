
import java.util.Scanner;

/**
 * Ejercicio : "Desarrolle una solución que determine el estado académico de una
 * persona estudiante en una asignatura universitaria a partir de una 
 * calificación de evaluación continua, una calificación de examen final y 
 * un porcentaje de asistencia. La regla institucional establece que:
La asistencia mínima debe alcanzarse para ser evaluado
Existe una nota mínima en el examen final, y
La nota final se calcula combinando evaluación continua y examen final.
La salida debe indicar “Aprobado”, “Supletorio” o “Reprobado”, y mostrar la nota
* final redondeada a un decimal."
 * @author Nicolás Córdova
 * @version 1.0
 */

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double evaluacionContinua;
        double evaluacionFinal;
        double asistencia;
        double notaFinal;
        System.out.print("Ingrese su porcentaje de asistencia: ");
        asistencia = tcl.nextDouble();
        System.out.print("Ingrese nota de la evaluación continua: ");
        evaluacionContinua = tcl.nextDouble();
        System.out.print("Ingrese nota de la evaluación final: ");
        evaluacionFinal = tcl.nextDouble();
        notaFinal = (evaluacionContinua * 0.40) + (evaluacionFinal * 0.60);
        notaFinal = Math.round(notaFinal * 10.0)/10.0;
        System.out.println("Su nota final es: " + notaFinal);
        if (asistencia > 70) {
            System.out.println("Cumple con la asistencia");}
        else {
            System.out.println("No cumple con la asistencia");
        }
        if (notaFinal >= 7){
            System.out.println("Aprobado");}
        else{
            System.out.println("Repobrado");       
        } } } 
 
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese su porcentaje de asistencia: 78
Ingrese nota de la evaluaci�n continua: 9
Ingrese nota de la evaluaci�n final: 9
Su nota final es: 9.0
Cumple con la asistencia
Aprobado
BUILD SUCCESSFUL (total time: 9 seconds)
 */
