package com.qmp;

public class Prenda{
  private final TipoDePrenda tipoDePrenda;
  private final Material material;
  private final Color colorPrincipal;
  private final Trama trama;

  public Prenda(TipoDePrenda tipoDePrenda, Material material, Color colorPrincipal, Trama trama) {
    this.tipoDePrenda = tipoDePrenda;
    this.material = material;
    this.colorPrincipal = colorPrincipal;
    this.trama = trama;
  }
  
}
