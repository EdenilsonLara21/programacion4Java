/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calcularareavolumen;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class CalcularAreaVolumen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingresar radio: ");//pedir radio al usuario
        Double radio = scanner.nextDouble();
        
        //calcular area
        double area = calcularArea(radio);
        //calcular volumen
        double volumen = calcularVolumen(radio);
        
        //resultados que se mostraran al user
        System.out.print("\n El área es: " + area);
        System.out.print("\n El volumen es: " + volumen);
        
                  
    }
    //creamos una clase para denotar formula para el area
     public static double calcularArea(double radio) {
        double pi = 3.1415926535;
        return pi * radio * radio;
    }
    //creamos una clase para denotar formula para el volumen
    public static double calcularVolumen(double radio) {
        double pi = 3.1415926535;
        return (4/3) * pi * radio * radio * radio;
    }
}
