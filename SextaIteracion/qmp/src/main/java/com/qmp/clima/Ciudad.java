package com.qmp.clima;

public interface Ciudad {

  String probabilidadDeLluvia();
  
  int temperaturaCelsius();

  String[] alertasMeteorologicas();
  
  String getNombre();
}
