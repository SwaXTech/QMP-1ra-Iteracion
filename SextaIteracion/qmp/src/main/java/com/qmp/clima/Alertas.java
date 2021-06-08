package com.qmp.clima;

import java.util.ArrayList;
import java.util.List;

public class Alertas {

  private final List<String> alertas = new ArrayList<>();
  private final Ciudad ciudad;

  public Alertas(Ciudad ciudad){
    this.ciudad = ciudad;
  }

  public void actualizarAlertas(){
    alertas.clear();
    alertas.addAll(ciudad.alertasMeteorologicas());
  }

  public List<String> getAlertas() {
    return alertas;
  }

  public boolean esEstaCiudad(String ciudad) {
    return this.ciudad.getNombre().equals(ciudad);
  }
}
