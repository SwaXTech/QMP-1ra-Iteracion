package com.qmp.atuendo;

import com.qmp.clima.Ciudad;
import com.qmp.prenda.Prenda;

public class Atuendo {
  private final Prenda parteInferior;
  private final Prenda parteSuperior;
  private final Prenda calzado;
  private final Prenda accesorio;
  private final Ciudad ciudad;
  
  public Atuendo(Ciudad ciudad, Prenda parteInferior, Prenda parteSuperior, Prenda calzado, Prenda accesorio) {
    this.parteInferior = parteInferior;
    this.parteSuperior = parteSuperior;
    this.calzado = calzado;
    this.accesorio = accesorio;
    this.ciudad = ciudad;
  }

  public Atuendo sugerirse(){
    validarTemperatura(parteSuperior);
    validarTemperatura(parteInferior);
    validarTemperatura(calzado);
    validarTemperatura(accesorio);
    return this;
  }

  private void validarTemperatura(Prenda prenda){
    if(!prenda.esAptaPara(ciudad.temperaturaCelsius()))
      throw new RuntimeException("La prenda no es adecuada");

    
  }
}
