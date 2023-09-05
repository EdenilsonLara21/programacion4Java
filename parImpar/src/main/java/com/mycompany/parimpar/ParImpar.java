/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parimpar;
import java.util.Scanner;

/**
 *
 * @author ALUMNO
 */
public class ParImpar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); /*pedirle datos al usuario*/
        
        
        /*par o impar*/
        System.out.print("\n NUMERO PAR O IMPAR");
        System.out.println("\n ingrese el numero:");
        int numero = scanner.nextInt();
        
        if(numero%2==0) {
            System.out.print("el numero" + numero +" es par");
        }
        else{
            System.out.print("este numero es impar");
        }     
           
       }
             
    }

   

        