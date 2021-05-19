package com.qmp.prenda;

public class Prenda{
  private final TipoDePrenda tipoDePrenda;
  private final Material material;
  private final Color colorPrincipal;
  private final Color colorSecundario;
  private final Trama trama;
  
  public Prenda(TipoDePrenda tipoDePrenda, Material material, Color colorPrincipal, Color colorSecundario,
      Trama trama) {
    this.tipoDePrenda = tipoDePrenda;
    this.material = material;
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;
    this.trama = trama;
  }

  
  
}
