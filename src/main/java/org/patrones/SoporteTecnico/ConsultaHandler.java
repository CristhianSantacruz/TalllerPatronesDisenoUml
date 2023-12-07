package org.patrones.SoporteTecnico;

public abstract  class ConsultaHandler implements Handler {
    Handler h;

    public ConsultaHandler(Handler h) {
        this.h = h;
    }

    public Handler getH() {
        return h;
    }

    public void setH(Handler h) {
        this.h = h;
    }
}
