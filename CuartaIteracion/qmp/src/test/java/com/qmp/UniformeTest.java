package com.qmp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.qmp.prenda.Categoria;
import com.qmp.prenda.Color;
import com.qmp.prenda.Material;
import com.qmp.prenda.Prenda;
import com.qmp.prenda.TipoDePrenda;
import com.qmp.prenda.Trama;
import com.qmp.uniforme.SastreJohnston;
import com.qmp.uniforme.SastreSanJuan;
import com.qmp.uniforme.Uniforme;

class UniformeTest {

  Uniforme uniformeSanJuan;
  Uniforme uniformeJohnston;

  @BeforeEach
  void setup(){
    uniformeSanJuan = new SastreSanJuan().crearUniforme();
    uniformeJohnston = new SastreJohnston().crearUniforme();
  }

  @Test
  void superiorSanJuan() {
    Prenda prenda = crearUniformeSanJuan().getParteSuperior();
    assertEquals(prenda.getCategoria(), uniformeSanJuan.getParteSuperior().getCategoria());
  }

  @Test
  void inferiorSanJuan() {
    Prenda prenda = crearUniformeSanJuan().getParteInferior();
    assertEquals(prenda.getCategoria(), uniformeSanJuan.getParteInferior().getCategoria());
  }

  @Test
  void calzadoSanJuan() {
    Prenda prenda = crearUniformeSanJuan().getCalzado();
    assertEquals(prenda.getCategoria(), uniformeSanJuan.getCalzado().getCategoria());
  }


  @Test
  void superiorJohnston() {
    Prenda prenda = crearUniformeJohnston().getParteSuperior();
    assertEquals(prenda.getCategoria(), uniformeJohnston.getParteSuperior().getCategoria());
  }

  @Test
  void inferiorJohnston() {
    Prenda prenda = crearUniformeJohnston().getParteInferior();
    assertEquals(prenda.getCategoria(), uniformeJohnston.getParteInferior().getCategoria());
  }

  @Test
  void calzadoJohnston() {
    Prenda prenda = crearUniformeJohnston().getCalzado();
    assertEquals(prenda.getCategoria(), uniformeJohnston.getCalzado().getCategoria());
  }

  private Uniforme crearUniformeSanJuan() {
    return new Uniforme(
      new Prenda(
        new TipoDePrenda(Categoria.PARTE_SUPERIOR),
        Material.PIQUE,
        new Color(0,255,0),
        null,
        Trama.LISA,
        24
      ),
      new Prenda(
        new TipoDePrenda(Categoria.PARTE_INFERIOR),
        Material.ACETATO,
        new Color(155,155,155),
        null,
        Trama.LISA,
        24
      ),
      new Prenda(
        new TipoDePrenda(Categoria.CALZADO),
        null,
        new Color(0,0,0),
        null,
        Trama.LISA,
        24
      )
    );
  }

  private Uniforme crearUniformeJohnston() {
    return new Uniforme(
      new Prenda(
        new TipoDePrenda(Categoria.PARTE_SUPERIOR),
        null,
        new Color(255,255,255),
        null,
        Trama.LISA,
        24
      ),
      new Prenda(
        new TipoDePrenda(Categoria.PARTE_INFERIOR),
        null,
        new Color(0,0,0),
        null,
        Trama.LISA,
        24
      ),
      new Prenda(
        new TipoDePrenda(Categoria.CALZADO),
        null,
        new Color(0,0,0),
        null,
        Trama.LISA,
        24
      )
    );
  }
}
