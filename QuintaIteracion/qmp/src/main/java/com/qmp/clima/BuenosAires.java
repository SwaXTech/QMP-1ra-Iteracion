package com.qmp.clima;

public class BuenosAires implements Ciudad{

  ServicioClima servicioClima = RepositorioServicios.getInstance().getServicioActual();
  
  @Override
  public String probabilidadDeLluvia(){ 
    return servicioClima.probabilidadDeLluvias("Buenos Aires, Argentina");
  }
  
  @Override
  public int temperaturaCelsius(){
    int tempFarenheit = servicioClima.temperatura("Buenos Aires, Argentina");
    return tempFarenheit - 32;
  }
}
