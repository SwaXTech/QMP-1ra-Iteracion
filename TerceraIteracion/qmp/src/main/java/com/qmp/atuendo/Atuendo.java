package com.qmp.atuendo;

import com.qmp.clima.Ciudad;
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

  public boolean esSugerible(Ciudad ciudad){
    return validarTemperatura(ciudad, parteSuperior) &&
           validarTemperatura(ciudad, parteInferior) &&
           validarTemperatura(ciudad, calzado)       &&
           validarTemperatura(ciudad, accesorio);
  }

  private boolean validarTemperatura(Ciudad ciudad, Prenda prenda){
    return prenda.esAptaPara(ciudad.temperaturaCelsius());
  }
}
