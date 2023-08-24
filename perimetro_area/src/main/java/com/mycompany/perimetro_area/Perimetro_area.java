/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.perimetro_area;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Perimetro_area {

    public static void main(String[] args) {
        /* Scanner nos ayuda a obtener los valores*/
        Scanner scanner = new Scanner(System.in);
        /* pedimos al usuario que ingrese la longitud*/
        System.out.print("Inserte el valor de la longitud del rectangulo:");
        double longitud = scanner.nextDouble();
        /* pedimos al usuario que ingrese el ancho*/
        System.out.print("Inserte el valor de el ancho del rectangulo:");
        double ancho = scanner.nextDouble();
        /* metodos*/
        double perimetro = calcularPerimetro(longitud, ancho);
        double area = calcularArea(longitud, ancho);
        /* lo que recibira el usuario*/
        System.out.println("El perímetro del rectángulo es: " + perimetro);
        System.out.println("El área del rectángulo es: " + area);
        
     
        scanner.close();/* cerramos el scanner*/
    }
    /* metodo para calcular el area*/
    public static double calcularArea(double longitud, double ancho) {
        return longitud * ancho;/* formula: b*h*/
        
    } 
    /* metodo para calcular el perimetro*/
     public static double calcularPerimetro(double longitud, double ancho) {
        return 2 * (longitud + ancho);/* formula: P = 2h + 2b*/
    }
   
}
