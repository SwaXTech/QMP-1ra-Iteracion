package com.qmp.guardarropas;

import java.util.ArrayList;
import java.util.List;

import com.qmp.atuendo.Atuendo;

public class Guardarropas {

  private final List<Atuendo> atuendos;
  private final String criterio;

  public Guardarropas(String criterio) {
    this.atuendos = new ArrayList<>();
    this.criterio = criterio;
  }

  public void agregar(Atuendo atuendo){
    atuendos.add(atuendo);
  }

  public void remover(Atuendo atuendo){
    atuendos.remove(atuendo);
  }

  public int cantidadDeAtuendos() {
    return atuendos.size();
  }

  public String getCriterio() {
    return criterio;
  }
  
  
  
}
