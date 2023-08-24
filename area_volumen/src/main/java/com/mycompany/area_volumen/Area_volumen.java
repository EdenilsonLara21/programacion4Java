/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.area_volumen;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Area_volumen {

    public static void main(String[] args) {
        /* Scanner nos ayuda a obtener los valores*/
        Scanner scanner = new Scanner(System.in);
        
        /* Pedimos que el usuario ingrese el valor del radio*/
        System.out.print("Ingrese el radio de la circunferencia:");
        double radio = scanner.nextDouble(); 
        
        /* metodos*/
        double area = calcularAreaCircunferencia(radio); 
        double volumen = calcularVolumenCircunferencia(radio);
        
        /* lo que va  a recibir el usuario*/
        System.out.println("El area de una circunferencia es" + area);
        System.out.println("El volumen de una circunferencia es" + volumen);
        
        scanner.close();/* cerramos el scanner*/
    }
    /* metodo para obtener el area de la circunferencia*/
    public static double calcularAreaCircunferencia(double radio){
            return Math.PI * radio * radio;/* formula del areaCircuferencia:"Pi*r*r"*/
    }
    /* metodo para obtener el VolumenCircunferencia*/
    public static double calcularVolumenCircunferencia(double radio){
             return (4.0 / 3.0) * Math.PI * radio * radio * radio;/* formula del volumenCircuferencia:"3.4*Pi*r³"*/
    }
}
