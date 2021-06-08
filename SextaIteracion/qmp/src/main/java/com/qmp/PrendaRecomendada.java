package com.qmp;

import com.qmp.clima.Ciudad;
import com.qmp.prenda.Prenda;

public class PrendaRecomendada {
  
  private Prenda prenda;
  private Ciudad ciudad;
  
  public PrendaRecomendada(Ciudad ciudad) {
    this.ciudad = ciudad;
  }

  public void actualizarPrenda(){
    int temperatura = ciudad.temperaturaCelsius();
    prenda = RepositorioPrendas.getINSTANCE().prendaPara(prenda -> prenda.esAptaPara(temperatura));
  }

  public boolean esEstaCiudad(String ciudad){
    return this.ciudad.getNombre().equals(ciudad);
  }

  public Prenda getPrenda() {
    return prenda;
  }

  
  
}
