package com.qmp.clima;

public class BuenosAires implements Ciudad{

  ServicioClima servicioClima = RepositorioServicios.getInstance().getServicioActual();
  
  public String probabilidadDeLluvia(){ 
    return servicioClima.probabilidadDeLluvias("Buenos Aires, Argentina");
  }
  
  public int temperaturaCelsius(){
    int tempFarenheit = servicioClima.temperatura("Buenos Aires, Argentina");
    return tempFarenheit - 32;
  }
}
