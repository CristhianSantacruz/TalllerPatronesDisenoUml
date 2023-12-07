package org.patrones.Decorator;

import org.patrones.CreacionProducto.Producto;

public class ResolucionDecorator extends ProductDecorator{

    public ResolucionDecorator(Producto producto) {
        super(producto);
    }
    
    @Override
    public void personalizar() {
        System.out.println("se aumento la resolucion");
    }
    
}
