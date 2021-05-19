package com.qmp;

import com.qmp.prenda.Prenda;

public class Atuendo {
  private final Prenda parteInferior;
  private final Prenda parteSuperior;
  private final Prenda calzado;
  private final Prenda accesorio;
  
  public Atuendo(Prenda parteInferior, Prenda parteSuperior, Prenda calzado, Prenda accesorio) {
    this.parteInferior = parteInferior;
    this.parteSuperior = parteSuperior;
    this.calzado = calzado;
    this.accesorio = accesorio;
  }
}
