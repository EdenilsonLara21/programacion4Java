/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.usingcontinue;

/**
 *
 * @author Dell
 */
public class UsingContinue {

    public static void main(String[] args) {
                 /*ejemplo continue*/
          
         String searchMe = "pedro participo en una pelicula" + "para pagar su perro";
                 int max = searchMe.length();
                 int numPs = 0;
                 
                 for(int i=0; i < max; i++){
             if(searchMe.charAt(i) != 'p'){
            continue;
            }   
         numPs++;
    }
System.out.println("encontradas  " + numPs + "p's en el String." );
    }
}
