/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mayordetresnumeros;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class MayorDeTresNumeros {

    public static void main(String[] args) {  
        /* Scanner nos ayuda a obtener los valores*/
        Scanner scanner = new Scanner(System.in);
        
        /* pedimos los valores al usuario*/
        System.out.print("Ingrese el primer numero: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Ingrese el primer numero: ");
        double numero2 = scanner.nextDouble();
        System.out.print("Ingrese el primer numero: ");
        double numero3 = scanner.nextDouble();
        
        /*lo que visualizara el usuario*/
        double mayor = Math.max(numero1, Math.max(numero2, numero3));
        System.out.println("El numero mayor es: " + mayor);

        scanner.close();/* cerramos el scanner*/
    }
}
