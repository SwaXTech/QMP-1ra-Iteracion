package com.qmp.prenda;

public class PrendaBuilder {
  private TipoDePrenda tipoDePrenda;
  private Material material;
  private Color colorPrincipal;
  private Color colorSecundario;
  private Trama trama;

  public PrendaBuilder(TipoDePrenda tipoDePrenda){
    this.tipoDePrenda = tipoDePrenda;
    this.trama = Trama.LISA;
  }

  public PrendaBuilder especificarMaterial(Material material){
    this.material = material;
    return this;
  }

  public PrendaBuilder especificarColorPrincipal(Color colorPrincipal){
    this.colorPrincipal = colorPrincipal;
    return this;
  }

  public PrendaBuilder especificarColorSecundario(Color colorSecundario){
    this.colorSecundario = colorSecundario;
    return this;
  }

  public PrendaBuilder especificarTrama(Trama trama){
    this.trama = trama;
    return this;
  }

  public Prenda crearPrenda(){
    return new Prenda(
      tipoDePrenda, material, colorPrincipal, colorSecundario, trama
    );
  }





  
}
