/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productos;

/**
 *
 * @author Dell
 */
public class productosRefrigerados extends BDProductos{
    private String codigo;
    
    public productosRefrigerados(String nombre){super(nombre);}
    
    public void setCodigo(String codigo){this.codigo = codigo;}
    
    ///sobreescribimos metodo
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Código: " + codigo);
    }
    
}
