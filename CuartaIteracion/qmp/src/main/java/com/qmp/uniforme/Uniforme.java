package com.qmp.uniforme;

import com.qmp.prenda.Prenda;

public class Uniforme {

  private final Prenda parteInferior;
  private final Prenda parteSuperior;
  private final Prenda calzado;
  
  public Uniforme(Prenda parteInferior, Prenda parteSuperior, Prenda calzado) {
    this.parteInferior = parteInferior;
    this.parteSuperior = parteSuperior;
    this.calzado = calzado;
  }

  Uniforme crearUniforme(Sastre sastre){
    return sastre.crearUniforme();
  }

  public Prenda getParteSuperior() {
    return parteSuperior;
  }

  public Prenda getParteInferior() {
    return parteInferior;
  }
  public Prenda getCalzado() {
    return calzado;
  }
  
}
