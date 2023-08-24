/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nombre_y_fecha;
import javax.swing.JOptionPane;
import java.util.Date;


/**
 *
 * @author Dell
 */

   /*nombreFecha.java*/
public class Nombre_y_fecha {

    public static void main(String[] args) {
         
    {
       /* llamamos la fecha*/
        Date date = new Date();
         /* tipos de datos de las variables*/
        String name; 
        String lastname; 

         /* pedimos al usuario que ingrese los datos*/
         name = JOptionPane.showInputDialog( "Escriba su nombre" );
        lastname= JOptionPane.showInputDialog( "Escriba su apellido" );
         /* esto es lo que se le mostrara al usuario*/
        JOptionPane.showMessageDialog(null, "Su nombre completo es:  " + name + "  " + lastname + "  " );
        System.out.println("Su nombre completo es: " +name + " " + lastname +" "+ date);

         
        System.out.println(date); /* pedimos que se muestre la fecha junto con el nombre y el apellido que dio el usuario*/
    } 
    

    }
}

