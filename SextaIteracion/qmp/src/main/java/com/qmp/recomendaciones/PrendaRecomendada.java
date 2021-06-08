package com.qmp.recomendaciones;

import com.qmp.clima.Ciudad;
import com.qmp.clima.CondicionClimatica;
import com.qmp.prenda.Prenda;

public class PrendaRecomendada {
  
  private Prenda prenda;
  private Ciudad ciudad;
  
  public PrendaRecomendada(Ciudad ciudad) {
    this.ciudad = ciudad;
  }

  public void actualizarPrenda(){
    CondicionClimatica condicionesClimaticas = ciudad.condicionesClimaticas();
    prenda = RepositorioPrendas.getINSTANCE().prendaPara(prenda -> prenda.esAptaPara(condicionesClimaticas));
  }

  public boolean esEstaCiudad(String ciudad){
    return this.ciudad.getNombre().equals(ciudad);
  }

  public Prenda getPrenda() {
    return prenda;
  }

  
  
}
