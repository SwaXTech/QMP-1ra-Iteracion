package com.qmp.guardarropas;

import com.qmp.prenda.Prenda;

public abstract class Sugerencia {

  private final Prenda prenda;
  private final Guardarropas guardarropas;
  private Estado estado;
  
  public Sugerencia(Guardarropas guardarropas, Prenda prenda) {
    this.prenda = prenda;
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

  public Prenda getPrenda() {
    return prenda;
  }

  public boolean pendiente(){
    return estado == Estado.PENDIENTE;
  }

  

}
