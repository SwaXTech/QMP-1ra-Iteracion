package com.qmp.clima;


public class Alerta {

  private final String alerta;
  private final Ciudad ciudad;

  public Alerta(Ciudad ciudad, String alerta){
    this.ciudad = ciudad;
    this.alerta = alerta;
  }

  public String getAlerta() {
    return alerta;
  }

  public Ciudad getCiudad() {
    return ciudad;
  }

  public boolean esEstaCiudad(String ciudad) {
    return this.ciudad.getNombre().equals(ciudad);
  }
}
