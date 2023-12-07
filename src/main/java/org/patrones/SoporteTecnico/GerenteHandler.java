package org.patrones.SoporteTecnico;

public class GerenteHandler extends ConsultaHandler{

    public GerenteHandler(Handler h) {
        super(h);
    }

    @Override
    public void setNext(Handler h) {

    }

    @Override
    public String respuesta() {
        if(aprobar()){
            return "aprobado";
        }else {
            return "no aprobado";
        }
    }

    public boolean aprobar(){
        return false;
    }
}
