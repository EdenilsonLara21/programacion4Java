/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operacionesbasicas;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class OperacionesBasicas {

    public static void main(String[] args) {
        /* Scanner nos ayuda a obtener los valores*/
        Scanner scanner = new Scanner(System.in);

        /* pedimos que el usuario ingrese los numeros*/
        System.out.print("Ingresa el primer numero: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo numero: ");
        double numero2 = scanner.nextDouble();
       
        /* funciones de la calculadora*/
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2; 
        
       /* comparacion*/ if (numero2 != 0) {/* si se escoge el valor de "0" en la opcion de "numero2"
         tendra las siguientes rstricciones  */
            double division = numero1 / numero2;
            System.out.println("Suma: " + suma);
            System.out.println("Resta: " + resta);
            System.out.println("Multiplicación: " + multiplicacion);
            System.out.println("División: " + division);
            
        } else {
            System.out.println("Suma: " + suma);
            System.out.println("Resta: " + resta);
            System.out.println("Multiplicación: " + multiplicacion);
            System.out.println("No es posible dividir entre cero.");/* regla matematica*/
        }

        scanner.close();/* cerramos el scanner*/
    }
}

