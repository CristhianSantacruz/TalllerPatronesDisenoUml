package org.patrones.TransporteProducto;

public class Transporte {
    private RutaStrategy rutaStrategy;
    
    public Transporte(RutaStrategy strategy) {
        rutaStrategy = strategy;
    }
    
    public void setStrategy(RutaStrategy strategy) {
        this.rutaStrategy = strategy;
    }
    
    public void executeStrategy(String a, String b) {
        rutaStrategy.construirRuta(a, b);
    }
}
