package org.patrones.Decorator;

import org.patrones.CreacionProducto.Producto;

public abstract class ProductDecorator implements RequerimientoProduct{
    private Producto producto;

    public ProductDecorator(Producto producto) {
        this.producto = producto;
    }
    
    
}
