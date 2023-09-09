/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.forswich;

/**
 *
 * @author Dell
 */
public class ForSwich {

   /* Programa ciclos*/
public static void main (String args[]){
    int a = 1;
String dia;
for(int numeroDia=1; numeroDia<=7; numeroDia++){
    
switch (numeroDia) {
case 1: dia= " Lunes"; 
break;
case 2: dia= " Martes";
break;
case 3: dia= " Miercoles";
break;
case 4: dia= " Jueves";
break;
case 5: dia= " Viernes";
break;
case 6: dia= " Sabado";
break;
case 7: dia= " Domingo";
break;
default: dia= " ¿Que Dia es Hoy?"; 
break;
}// fin del switch
System.out.print("Hoy es "+ dia +" el dia Nº "+ numeroDia + " de la Semana.");
}//fin del for
}// fin del main
}//fin de la clase

