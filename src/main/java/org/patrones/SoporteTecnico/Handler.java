package org.patrones.SoporteTecnico;

public interface Handler {

   void setNext(Handler h);
   String respuesta();
}
