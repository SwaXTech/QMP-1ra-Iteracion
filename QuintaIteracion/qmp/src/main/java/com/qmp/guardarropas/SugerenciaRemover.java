package com.qmp.guardarropas;

import com.qmp.atuendo.Atuendo;

public class SugerenciaRemover extends Sugerencia{

  public SugerenciaRemover(Guardarropas guardarropas, Atuendo atuendo) {
    super(guardarropas, atuendo);
  }

  @Override
  public void hacerCambio() {
    getGuardarropas().remover(getAtuendo());
  }

  @Override
  public void deshacerCambio() {
    getGuardarropas().agregar(getAtuendo());
    rechazar();
  }
  
}
