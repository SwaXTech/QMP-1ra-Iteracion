package com.qmp.guardarropas;

import com.qmp.atuendo.Atuendo;

public abstract class Sugerencia {

  private final Atuendo atuendo;
  private final Guardarropas guardarropas;
  private Estado estado;
  
  public Sugerencia(Guardarropas guardarropas, Atuendo atuendo) {
    this.atuendo = atuendo;
    this.guardarropas = guardarropas;
    this.estado = Estado.PENDIENTE;
  }

  public void aprobar(){
    estado = Estado.APROBADA;
    hacerCambio();
  }

  public void rechazar(){
    estado = Estado.RECHAZADA;
  }

  public abstract void hacerCambio();

  public abstract void deshacerCambio();

  public Guardarropas getGuardarropas() {
    return guardarropas;
  }

  public Atuendo getAtuendo() {
    return atuendo;
  }

  public boolean pendiente(){
    return estado == Estado.PENDIENTE;
  }

  

}
