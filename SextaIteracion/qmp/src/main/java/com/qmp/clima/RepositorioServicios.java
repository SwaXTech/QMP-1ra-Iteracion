package com.qmp.clima;

import java.util.ArrayList;
import java.util.List;

public class RepositorioServicios {
  
  private final List<ServicioClima> servicios = new ArrayList<>();
  private ServicioClima servicioActual;
  private static final RepositorioServicios INSTANCE = new RepositorioServicios();

  private RepositorioServicios(){}

  public ServicioClima getServicioActual() {
    return servicioActual;
  }
  public void setServicioActual(ServicioClima servicioActual) {
    this.servicioActual = servicioActual;
  }

  public void agregarServicio(ServicioClima servicio){
    servicios.add(servicio);
  }

  public void eliminarServicio(ServicioClima servicio){
    servicios.remove(servicio);
  }
  
  public static RepositorioServicios getInstance() {
    return INSTANCE;
  }

  public void clear(){
    servicios.clear();
  }
  
}
