package com.qmp.uniforme;

import com.qmp.prenda.Categoria;
import com.qmp.prenda.Color;
import com.qmp.prenda.Material;
import com.qmp.prenda.Prenda;
import com.qmp.prenda.PrendaBuilder;
import com.qmp.prenda.TipoDePrenda;

public class SastreSanJuan implements Sastre{

  @Override
  public Prenda fabricarParteSuperior() {
    return new PrendaBuilder(new TipoDePrenda(Categoria.PARTE_SUPERIOR)) //TODO: Especificar chomba
        .especificarColorPrincipal(new Color(0,255,0))
        .especificarMaterial(Material.PIQUE)
        .crearPrenda();
  }

  @Override
  public Prenda fabricarParteInferior() {
    return new PrendaBuilder(new TipoDePrenda(Categoria.PARTE_INFERIOR)) //TODO: Especificar pantalon
    .especificarColorPrincipal(new Color(155,155,155))
    .especificarMaterial(Material.ACETATO)
    .crearPrenda();
  }

  @Override
  public Prenda fabricarParteCalzado() {
    return new PrendaBuilder(new TipoDePrenda(Categoria.CALZADO)) //TODO: Especificar calzado
    .especificarColorPrincipal(new Color(255,255,255))
    .crearPrenda();
  }
  
}
