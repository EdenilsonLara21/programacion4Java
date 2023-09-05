/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.usingbreak;

/**
 *
 * @author Dell
 */
public class UsingBreak {

    public static void main(String[] args) {
             
           /*ejemplo de break*/
           System.out.print("\n BREAK");
          for(int i=1; i<20; i++){
               System.out.println("\n el contador es: " + i );
               if(i==7)
              {System.out.println("\n el contador llego a 7 " );
              break;
              }
            }
           
    }
}
