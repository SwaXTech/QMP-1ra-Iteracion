package com.qmp;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.qmp.guardarropas.Guardarropas;
import com.qmp.guardarropas.Sugerencia;

public class Usuario {
  private List<Guardarropas> misGuardarropas;
  private List<Sugerencia> sugerencias;

  public Usuario() {
    this.misGuardarropas = new ArrayList<>();
    this.sugerencias = new ArrayList<>();
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

  
}
