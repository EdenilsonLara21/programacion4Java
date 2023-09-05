/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numeromayor;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class NumeroMayor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
         /*mayor que*/
         System.out.print("\n NUMERO MAYOR");
        
        System.out.println("\n ingrese el primer numero");
        int primerNumero = scanner.nextInt();
        System.out.println("ingrese el segundo numero");
        int segundoNumero = scanner.nextInt();
        System.out.println("ingrese el tercer numero");
        int tercerNumero = scanner.nextInt();
        
        if(primerNumero>segundoNumero) {
            if (primerNumero>tercerNumero) {
                System.out.print("el numero mayor es: "+ primerNumero );
            }
            
        }
        else if (segundoNumero>tercerNumero) {
            System.out.print("el numero mayor es: "+ segundoNumero );
        }
        else{
             System.out.print("el numero mayor es: "+ tercerNumero );
        }

    }
}
