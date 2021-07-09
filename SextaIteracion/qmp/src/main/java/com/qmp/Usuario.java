package com.qmp;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.qmp.clima.Alerta;
import com.qmp.guardarropas.Guardarropas;
import com.qmp.guardarropas.Sugerencia;
import com.qmp.otros_servicios.Notificador;

public class Usuario {
  private List<Guardarropas> misGuardarropas;
  private List<Sugerencia> sugerencias;
  private List<Notificacion> interesadosDeAlertas;
  
  private String email;
  private String ciudad;
  private Sugerencia sugerenciaDiaria;

  public Usuario(String email, String ciudad) {
    this.misGuardarropas = new ArrayList<>();
    this.sugerencias = new ArrayList<>();
    this.interesadosDeAlertas = new ArrayList<>();
    this.email = email;
    this.ciudad = ciudad;
    this.sugerenciaDiaria = null;
  }

  public void agregarGuardarropas(Guardarropas guardarropas){
    misGuardarropas.add(guardarropas);
  }

  public void compartirUnGuardarropas(Guardarropas guardarropas){
    misGuardarropas.add(guardarropas);
  }

  public void recibirSugerencia(Sugerencia sugerencia){
    sugerencias.add(sugerencia);
  }

  public List<Sugerencia> sugerenciasPendientes(){
    return sugerencias.stream().filter(Sugerencia::pendiente).collect(Collectors.toList());
  }

  public List<Sugerencia> sugerencias(){
    return sugerencias;
  }

  public String getCiudad() {
    return ciudad;
  }

  public void activarNotificaciones(TipoAlerta tipoAlerta, Notificador notificador){
    interesadosDeAlertas.add(new Notificacion(this, tipoAlerta, notificador));
  }

  public void hayAlertasNuevas(List<Alerta> alertas) {
    interesadosDeAlertas.forEach(notificador -> notificador.notificar(alertas));
  }

  public void actualizarSugerenciaDiaria(){
    this.sugerenciaDiaria = this.sugerir();
  }

  public Sugerencia sugerir(){
    return null;
  }
  
}
