package org.patrones.SoporteTecnico;

public class TecnicoDepartamentoHandler extends ConsultaHandler {

    public TecnicoDepartamentoHandler(Handler h) {
        super(h);
    }

    @Override
    public void setNext(Handler h) {

    }

    @Override
    public String respuesta() {
        if(tipoFalloGarantia()){
            setNext(h);
            return "Contactando con el Jefe";
        }
        else{
            return "Lo sentimos";
        }
    }

    public boolean tipoFalloGarantia() {
        return false;
    }
}