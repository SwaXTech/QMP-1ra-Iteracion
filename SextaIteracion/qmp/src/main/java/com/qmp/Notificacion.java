package com.qmp;

import java.util.List;
import java.util.stream.Collectors;

import com.qmp.clima.Alerta;
import com.qmp.otros_servicios.Notificador;

public class Notificacion {

  private TipoAlerta tipoAlerta;
  private Notificador notificador;
  private Usuario usuario;

  public Notificacion(Usuario usuario, TipoAlerta tipoAlerta, Notificador notificador) {
    this.tipoAlerta = tipoAlerta;
    this.notificador = notificador;
    this.usuario = usuario;
  }

  public void notificar(List<Alerta> alertas){

    if(hayQueAlertar(alertas)){
      notificador.notificar(tipoAlerta.message());
    }

  }

  private boolean hayQueAlertar(List<Alerta> alertas){
    return !alertas.stream().filter(
      alerta -> alerta.esEstaCiudad(usuario.getCiudad()) && 
      alerta.getAlerta().equals(tipoAlerta.toString())
      ).collect(Collectors.toList()).isEmpty();
  }
  
}
