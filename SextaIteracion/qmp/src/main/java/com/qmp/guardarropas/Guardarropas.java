package com.qmp.guardarropas;

import java.util.ArrayList;
import java.util.List;
import com.qmp.prenda.Prenda;

public class Guardarropas {

  private final List<Prenda> prendas;
  private final String criterio;

  public Guardarropas(String criterio) {
    this.prendas = new ArrayList<>();
    this.criterio = criterio;
  }

  public void agregar(Prenda prenda){
    prendas.add(prenda);
  }

  public void remover(Prenda prenda){
    prendas.remove(prenda);
  }

  public int cantidadDePrendas() {
     return prendas.size();
  }

  public String getCriterio() {
    return criterio;
  }
  
}
