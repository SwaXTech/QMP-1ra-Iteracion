package com.qmp;

public class PrendaBuilder {
  private TipoDePrenda tipoDePrenda;
  private Material material;
  private Color colorPrincipal;
  private Color colorSecundario;
  private Trama trama;

  public PrendaBuilder() {
    this.trama = Trama.LISA;
  }

  PrendaBuilder especificarTipoPrenda(TipoDePrenda tipoDePrenda){
    this.tipoDePrenda = tipoDePrenda;
    return this;
  }

  PrendaBuilder especificarMaterial(Material material){
    this.material = material;
    return this;
  }

  PrendaBuilder especificarColorPrincipal(Color colorPrincipal){
    this.colorPrincipal = colorPrincipal;
    return this;
  }

  PrendaBuilder especificarColorSecundario(Color colorSecundario){
    this.colorSecundario = colorSecundario;
    return this;
  }

  PrendaBuilder especificarTrama(Trama trama){
    this.trama = trama;
    return this;
  }

  Prenda crearPrenda(){
    return new Prenda(
      tipoDePrenda, material, colorPrincipal, colorSecundario, trama
    );
  }





  
}
