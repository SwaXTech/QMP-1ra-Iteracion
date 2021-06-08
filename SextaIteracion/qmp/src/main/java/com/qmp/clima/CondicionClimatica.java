package com.qmp.clima;

import java.util.List;

import com.qmp.prenda.Prenda;

public class CondicionClimatica {
  
  private final int temperatura;
  private final List<String> condicionesClimaticas;
  public CondicionClimatica(int temperatura,List<String> condicionesClimaticas) {
    this.temperatura = temperatura;
    this.condicionesClimaticas = condicionesClimaticas;
  }


  public boolean seAdapta(Prenda prenda){
    return prenda.getTemperaturaAdecuada() > temperatura && prenda.getCondicionesClimaticasAdecuadas().equals(condicionesClimaticas);
  }
  
}
