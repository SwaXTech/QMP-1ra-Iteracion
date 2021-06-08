package com.qmp.prenda;

import java.util.List;

import com.qmp.clima.CondicionClimatica;

public class Prenda{
  private final TipoDePrenda tipoDePrenda;
  private final Material material;
  private final Color colorPrincipal;
  private final Color colorSecundario;
  private final Trama trama;

  private final int temperaturaAdecuada;
  private final List<String> condicionesClimaticasAdecuadas;

  public Prenda(TipoDePrenda tipoDePrenda, Material material, Color colorPrincipal, Color colorSecundario,
      Trama trama, int temperaturaAdecuada, List<String> condicionesClimaticasAdecuadas) {
    this.tipoDePrenda = tipoDePrenda;
    this.material = material;
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;
    this.trama = trama;
    this.temperaturaAdecuada = temperaturaAdecuada;
    this.condicionesClimaticasAdecuadas = condicionesClimaticasAdecuadas;
  }

  public Categoria getCategoria(){
    return tipoDePrenda.getCategoria();
  }

  public boolean esAptaPara(CondicionClimatica condicionClimatica){
    return condicionClimatica.seAdapta(this);
  }

  public TipoDePrenda getTipoDePrenda() {
    return tipoDePrenda;
  }

  public Material getMaterial() {
    return material;
  }

  public Color getColorPrincipal() {
    return colorPrincipal;
  }

  public Color getColorSecundario() {
    return colorSecundario;
  }

  public Trama getTrama() {
    return trama;
  }

  public int getTemperaturaAdecuada() {
    return temperaturaAdecuada;
  }

  public List<String> getCondicionesClimaticasAdecuadas() {
    return condicionesClimaticasAdecuadas;
  }
  
  
}
