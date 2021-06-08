package com.qmp.guardarropas;

import com.qmp.prenda.Prenda;

public class SugerenciaAgregar extends Sugerencia{

  public SugerenciaAgregar(Guardarropas guardarropas, Prenda prenda) {
    super(guardarropas, prenda);
  }

  @Override
  public void hacerCambio() {
    getGuardarropas().agregar(getPrenda());
  }

  @Override
  public void deshacerCambio() {
    getGuardarropas().remover(getPrenda());
    rechazar();
  }
  
}
