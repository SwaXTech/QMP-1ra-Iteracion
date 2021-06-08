package com.qmp.clima;

import java.util.List;

public class Ciudad {

  private String nombreCiudad;
  ServicioClima servicioClima = RepositorioServicios.getInstance().getServicioActual();

  public Ciudad(String nombreCiudad) {
    this.nombreCiudad = nombreCiudad;
  }
  
  public String probabilidadDeLluvia(){ 
    return servicioClima.probabilidadDeLluvias(getNombre());
  }
  
  public int temperaturaCelsius(){
    int tempFarenheit = servicioClima.temperatura(getNombre());
    return tempFarenheit - 32;
  }

  public List<String> alertasMeteorologicas() {
    return RepositorioAlertas.getInstance().getAlertasPara(nombreCiudad);
  }

  public String getNombre() {
    return nombreCiudad;
  }

  public CondicionClimatica condicionesClimaticas() {
    return new CondicionClimatica(temperaturaCelsius(), alertasMeteorologicas());
  }
}
