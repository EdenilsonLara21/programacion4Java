/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posicionesafabeto;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class PosicionesAfabeto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese su  nombre:");//pedimos datos al usuario
         String nombre = scanner.nextLine().toLowerCase(); /* Convertir el nombre a minúsculas */
        for(int i=0; i < nombre.length(); i++){ //ciclo for
            
            char letra = nombre.charAt(i); //tipo char por valores numericos y alfabeticos
            if (letra >= 'a' && letra <= 'z') { //iniciando la comparacion
                int posicion = letra - 'a' + 1;
                System.out.println(letra + " posicion " + posicion);//los que se le mostrara al user
            } else {
                System.out.println(letra + " no es una letra válida.");//en caso de error
                
            }
        }
        
        scanner.close();
    }
}
