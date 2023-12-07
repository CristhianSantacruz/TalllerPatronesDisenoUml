package org.patrones.Decorator;

import org.patrones.CreacionProducto.Producto;

public class AndroidTvDecorator extends ProductDecorator{

    public AndroidTvDecorator(Producto producto) {
        super(producto);
    }
    
    @Override
    public void personalizar() {
        
        System.out.println("se aumento la resolucion");
    }
    
}
