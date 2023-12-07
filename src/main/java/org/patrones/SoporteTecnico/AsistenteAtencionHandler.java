package org.patrones.SoporteTecnico;

public class AsistenteAtencionHandler  extends ConsultaHandler{
    public AsistenteAtencionHandler(Handler h) {
        super(h);
    }

    @Override
    public void setNext(Handler h) {

    }

    @Override
    public String respuesta() {
        if(verificarProductoGarantia()){
            setNext(h);
            return "Contactando con un Tecnico";
        }
        else{
            return "Lo sentimos";
        }
    }

    public boolean verificarProductoGarantia(){
        return false;
    }
}

