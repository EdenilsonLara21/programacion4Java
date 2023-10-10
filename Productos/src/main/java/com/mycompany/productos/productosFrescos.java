package com.mycompany.productos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class productosFrescos extends BDProductos{
    ///variables
    private String fechaEnvasado;
    private String paisOrigen;
    
    public productosFrescos (String nombre){super(nombre);}
    
    public void setFechaEnvasado(String fechaEnvasado){this.fechaEnvasado = fechaEnvasado;}
    
    public void setPaisOrigen(String paisOrigen){this.paisOrigen = paisOrigen;}
    
    ///sobreescribimos el metodo de mostrar info
    @Override
    public void mostrarInformacion(){
    super.mostrarInformacion();
    
    System.out.println("Fecha de Envasado: " + fechaEnvasado);
    System.out.println("País de Origen: " + paisOrigen);
    
    }
    
}
