package org.patrones.SoporteTecnico;

public class JefeInventarioHandler extends ConsultaHandler{
    public JefeInventarioHandler(Handler h) {
        super(h);
    }

    @Override
    public void setNext(Handler h) {

    }

    @Override
    public String respuesta() {
        if(verificaExistenciaProducto()){
            setNext(h);
            return "Precio supera los 1000$ , lo ponemos con el gerente";
        }
        else{
            return "Lo sentimos";
        }
    }

    public boolean verificaExistenciaProducto(){
        return false;
    }
}
