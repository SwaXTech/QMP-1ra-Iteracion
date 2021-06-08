package com.qmp.clima;

public class BuenosAires implements Ciudad{

  ServicioClima servicioClima = RepositorioServicios.getInstance().getServicioActual();
  
  @Override
  public String probabilidadDeLluvia(){ 
    return servicioClima.probabilidadDeLluvias(getNombre());
  }
  
  @Override
  public int temperaturaCelsius(){
    int tempFarenheit = servicioClima.temperatura(getNombre());
    return tempFarenheit - 32;
  }

  @Override
  public String[] alertasMeteorologicas() {
    return servicioClima.alertas(getNombre());
  }

  @Override
  public String getNombre() {
    return "Buenos Aires, Argentina";
  }

  
}
