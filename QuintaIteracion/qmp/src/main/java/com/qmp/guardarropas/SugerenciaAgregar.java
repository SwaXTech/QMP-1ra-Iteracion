package com.qmp.guardarropas;

import com.qmp.atuendo.Atuendo;

public class SugerenciaAgregar extends Sugerencia{

  public SugerenciaAgregar(Guardarropas guardarropas, Atuendo atuendo) {
    super(guardarropas, atuendo);
  }

  @Override
  public void hacerCambio() {
    getGuardarropas().agregar(getAtuendo());
  }

  @Override
  public void deshacerCambio() {
    getGuardarropas().remover(getAtuendo());
    rechazar();
    
  }
  
}
