package org.patrones.CreacionProducto;

public class Cliente {
    private TecnologyFactory fabrica;

    public Cliente(TecnologyFactory fabrica){
        this.fabrica = fabrica;
    }
    public void crearProducto(){
        Producto p = fabrica.createProducto();
        System.out.println(p);
    }

}
