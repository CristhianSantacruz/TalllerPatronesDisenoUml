/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.patrones.TransporteProducto;

/**
 *
 * @author User
 */
public class AutomotrizStrategy implements RutaStrategy{

    @Override
    public void construirRuta(String a, String b) {
        System.out.println("Trasnportando en vehiculo terrestre.");
    }
    
}
