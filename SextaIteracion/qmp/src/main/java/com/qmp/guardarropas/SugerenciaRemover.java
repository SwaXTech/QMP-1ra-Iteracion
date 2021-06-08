package com.qmp.guardarropas;

import com.qmp.prenda.Prenda;

public class SugerenciaRemover extends Sugerencia{

  public SugerenciaRemover(Guardarropas guardarropas, Prenda prenda) {
    super(guardarropas, prenda);
  }

  @Override
  public void hacerCambio() {
    getGuardarropas().remover(getPrenda());
  }

  @Override
  public void deshacerCambio() {
    getGuardarropas().agregar(getPrenda());
    rechazar();
  }
  
}
