package com.qmp.otros_servicios;

public interface MailSender {
  
  void send(String address, String message);
}
