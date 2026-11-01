import java.util.Scanner;
/**
 * Ejercicio : "Se debe generar una solución que permita calcular y mostrar el 
 * valor total a pagar mensual de servicios digitales de una persona.
 * Los servicios digitales son: netflix, youtube premium, dropbox, spotify. Si 
 * la persona es menor a 30 años se descuenta el 20% del total mensual."
 * @author Nicolás Córdova
 * @version 1.0
 */

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double netflix;
        double youtubePremium;
        double dropbox;
        double spotify;
        double total;
        int edad;
        double descuento;
        System.out.print("Ingrese su edad: ");
        edad = tcl.nextInt();
        System.out.print("Ingrese cuanto paga al mes en netflix: ");
        netflix = tcl.nextDouble();
        System.out.print("Ingrese cuanto paga al mes en youtubePremium: ");
        youtubePremium = tcl.nextDouble();
        System.out.print("Ingrese cuanto paga al mes en dropbox: ");
        dropbox = tcl.nextDouble();
        System.out.print("Ingrese cuanto paga al mes en spotify: ");
        spotify = tcl.nextDouble();
        total = netflix + youtubePremium + dropbox + spotify;
        if (edad < 30){
        descuento = total* 20/ 100;
        total = total - descuento;}
        System.out.println("El total mensual a pagar es : " + total);
        }
    }

/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese su edad: 18
Ingrese cuanto paga al mes en netflix: 20
Ingrese cuanto paga al mes en youtubePremium: 14
Ingrese cuanto paga al mes en dropbox: 12
Ingrese cuanto paga al mes en spotify: 4
El total mensual a pagar es : 40.0
BUILD SUCCESSFUL (total time: 13 seconds)
 */