/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.productos;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Productos {

    public static void main(String[] args) {
        ///importamos scanner para recibir respuesta del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriba el nombre del producto: ");
        String nombre = scanner.nextLine();
        
        ///menu de opciones
        System.out.println("--------------------MENU--------------------");
        System.out.println("Escribe el tipo de producto: ");
        System.out.println("1-Producto fresco");
        System.out.println("2-Prodcuto refrigerado");
        System.out.println("3-Producto congelado");
        
        int opcion = scanner.nextInt();
        ///funcion de las opciones
        switch(opcion){
            
        case 1:
            productosFrescos productoFresco = new productosFrescos(nombre);
            System.out.print("Ingrese la fecha de envasado");
            String fechaEnvasado = scanner.next();
            
            productoFresco.setFechaEnvasado(fechaEnvasado);
            System.out.print("Ingrese el país de origen: ");
            String paisOrigen = scanner.next();
            productoFresco.setPaisOrigen(paisOrigen);
            productoFresco.mostrarInformacion();
  
        break;
        
        case 2:
                productosRefrigerados productoRefrigerado = new productosRefrigerados(nombre);
                System.out.print("Ingrese el código: ");
                String codigo = scanner.next();
                productoRefrigerado.setCodigo(codigo);
                productoRefrigerado.mostrarInformacion();
                
        
        break;
        
        case 3:
            productosCongelados productoCongelado = new productosCongelados(nombre);
                System.out.print("Ingrese la temperatura: ");
                String temperatura = scanner.next();
                productoCongelado.setTemperatura(temperatura);
                productoCongelado.mostrarInformacion();
        
        break;
        
        default:
            System.out.println("Opción no válida"); ///en caso de que el usuario no responda correctamente..
    
        }
        
    
    }
}
