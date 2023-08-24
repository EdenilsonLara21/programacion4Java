/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.imprimirpalabra;
import java.util.Scanner;


/**
 *
 * @author Dell
 */
public class ImprimirPalabra {

     public static void main(String[] args) {
         /* Scanner nos ayuda a obtener los valores*/
        Scanner scanner = new Scanner(System.in);
        /* tipos de datos de variables*/
        String palabra = scanner.next();
        int numero = scanner.nextInt();

        /* pedimos datos de la palabra y el numero que quiera que se repita al usuario*/
        System.out.print("Ingresa una palabra: ");
        System.out.print("Ingresa un número: ");

        for (int i = 0; i < numero; i++) {/* pedimos que la palabra escrita por el usuaurio sea escrita el numero
            de veces que lo pida*/
            System.out.println( palabra);
        }

        scanner.close();/* cerramos el scanner*/
    }
    
}


