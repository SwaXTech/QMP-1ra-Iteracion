package com.qmp.otros_servicios;

public class NotificadorMail implements Notificador{

  @Override
  public void notificar(String texto) {
    System.out.println("Mail enviado: " + texto);
  }
}
