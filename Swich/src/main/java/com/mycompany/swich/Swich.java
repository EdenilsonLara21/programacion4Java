/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.swich;

/**
 *
 * @author Dell
 */
public class Swich {

    public static void main(String[] args) {
         /* swich */
       System.out.print("\n SWICH");
        int month = 9;
       String monthString;
       switch (month){
           case 1: monthString = "Enero";
           break;
           
           case 2: monthString = "Febrero";
           break;
           
           case 3: monthString = "Marzo";
           break;
           
           case 4: monthString = "Abril";
           break;

           case 5: monthString = "Mayo";
           break;
           
           case 6: monthString = "Junio";
           break;
           
           case 7: monthString = "Julio";
           break;
           
           case 8: monthString = "Agosto";
           break;
           
           case 9: monthString = "Septiembre";
           break;
           
           case 10: monthString = "Octubre";
           break;
           
           case 11: monthString = "Noviembre";
           break;
           
           case 12: monthString = "Diciembre";
           break;
           
           default: monthString = "Invalido";
           break;
           
           }
    }
}
