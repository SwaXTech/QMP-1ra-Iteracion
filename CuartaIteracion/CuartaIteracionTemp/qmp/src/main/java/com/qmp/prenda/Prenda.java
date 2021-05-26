package com.qmp.prenda;

public class Prenda{
  private final TipoDePrenda tipoDePrenda;
  private final Material material;
  private final Color colorPrincipal;
  private final Color colorSecundario;
  private final Trama trama;
  private final int temperaturaAdecuada;
  
  public Prenda(TipoDePrenda tipoDePrenda, Material material, Color colorPrincipal, Color colorSecundario,
      Trama trama, int temperaturaAdecuada) {
    this.tipoDePrenda = tipoDePrenda;
    this.material = material;
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;
    this.trama = trama;
    this.temperaturaAdecuada = temperaturaAdecuada;
  }

  public Categoria getCategoria(){
    return tipoDePrenda.getCategoria();
  }

  public boolean esAptaPara(int temperaturaEnCelsius){
    return temperaturaAdecuada > temperaturaEnCelsius;
  }
  
  
}
