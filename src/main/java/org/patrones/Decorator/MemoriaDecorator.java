package org.patrones.Decorator;

import org.patrones.CreacionProducto.Producto;

public class MemoriaDecorator extends ProductDecorator{

    public MemoriaDecorator(Producto producto) {
        super(producto);
    }
    
    @Override
    public void personalizar() {
        System.out.println("se aumento la memoria");
    }
    
}