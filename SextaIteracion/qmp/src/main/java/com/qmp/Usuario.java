package com.qmp;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.qmp.guardarropas.Guardarropas;
import com.qmp.guardarropas.Sugerencia;
import com.qmp.otros_servicios.MailSender;
import com.qmp.otros_servicios.NotificationService;

public class Usuario {
  private List<Guardarropas> misGuardarropas;
  private List<Sugerencia> sugerencias;

  private boolean recibirNotificaciones = true;
  private boolean recibirMail = true;
  
  private String email;
  private String ciudad;

  public Usuario(String email, String ciudad) {
    this.misGuardarropas = new ArrayList<>();
    this.sugerencias = new ArrayList<>();
    this.email = email;
    this.ciudad = ciudad;
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

  public void dejarDeRecibirMails(){
    recibirMail = false;
  }


  public void dejarDeRecibirNotificaciones(){
    recibirNotificaciones = false;
  }

  public void comenzarARecibirMails(){
    recibirMail = true;
  }

  public void comenzarARecibirNotificaciones(){
    recibirNotificaciones = true;
  }

  public void serNotificado(NotificationService notiService, MailSender sender, String mensaje){
    if(recibirNotificaciones){
      notiService.notify(mensaje);
    }

    if(recibirMail){
      sender.send(email, mensaje);
    }
  }

  
}
