/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.descuentos;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Descuentos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); ///para recibir respuestar de usuarios
        
        System.out.print("Ingrese el nombre del trabajador: ");//pedimos al usuario que ingrese su nombre
        ///declaramos variables con sus respectivos tipos de datos
        String nombre = scanner.nextLine();
        char genero = scanner.next().charAt(0);
        double sueldo = scanner.nextDouble();
        
        ///mandamos a llamar las clases
        double AFP = calcularAFP(sueldo);
        double ISSS = calcularISSS(sueldo, genero);
        double renta = calcularRenta(sueldo, genero);
        
        double totalDescuento = AFP + ISSS + renta;
        
        ///imprimimos el resultado
        System.out.println("Nombre: " + nombre);
        System.out.println("AFP: " + AFP);
        System.out.println("ISSS: " + ISSS);
        System.out.println("Renta: " + renta);
        System.out.println("Total de descuentos: " + totalDescuento);
    }
        
    
    ///clase para calcular afp
    public static double calcularAFP(double sueldo){
        double porcentaje = 0.0625; //de afp es 6.25%
        double descuento = 0;
        
        if(sueldo>300){ //el descuento aplica solo si su salario es mayor a $300
            descuento = sueldo * porcentaje;
        }
        return descuento;
    }
    //clase para calcuar isss
    public static double calcularISSS(double sueldo, char genero){
        double porcentajeIsss = (genero == 'H')? 0.03:0.02; //si es hombre es un 3%
        //si es mujer es un 2%
        return sueldo * porcentajeIsss;
    }
    //clase para calcular la renta
    public static double calcularRenta(double sueldo, char genero){
        double descuentoRenta = (genero == 'H')? 0.1:0.0; //para hombre la renta es de 10%
        //la mujer no tiene renta 
        return sueldo * descuentoRenta;
    }
}
