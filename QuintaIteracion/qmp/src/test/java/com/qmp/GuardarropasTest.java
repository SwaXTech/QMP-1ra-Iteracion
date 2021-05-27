package com.qmp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.qmp.atuendo.Atuendo;
import com.qmp.guardarropas.Guardarropas;
import com.qmp.guardarropas.Sugerencia;
import com.qmp.guardarropas.SugerenciaAgregar;
import com.qmp.guardarropas.SugerenciaRemover;
import com.qmp.prenda.Categoria;
import com.qmp.prenda.Color;
import com.qmp.prenda.Prenda;
import com.qmp.prenda.TipoDePrenda;
import com.qmp.uniforme.SastreSanJuan;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GuardarropasTest {

  Guardarropas guardarropas;
  Usuario usuario;

  @BeforeEach
  void setup(){
    guardarropas = new Guardarropas("Ropa de entrecasa");
    usuario = new Usuario();
    usuario.agregarGuardarropas(guardarropas);

    Atuendo atuendo = new Atuendo(
      new Prenda(new TipoDePrenda(Categoria.PARTE_SUPERIOR), null, new Color(0,0,0), null, null, 10),
      new Prenda(new TipoDePrenda(Categoria.PARTE_INFERIOR), null, new Color(0,0,0), null, null, 10),
      new Prenda(new TipoDePrenda(Categoria.CALZADO), null, new Color(0,0,0), null, null, 10),
      new Prenda(new TipoDePrenda(Categoria.ACCESORIO), null, new Color(0,0,0), null, null, 10)
    );

    Sugerencia sugerencia1 = new SugerenciaAgregar(guardarropas, atuendo);
    Sugerencia sugerencia2 = new SugerenciaRemover(guardarropas, atuendo);

    usuario.recibirSugerencia(sugerencia1);
    usuario.recibirSugerencia(sugerencia2);
  }

  @Test
  void elUsuarioTieneDosSugerenciasPendientes(){
    assertEquals(2, usuario.sugerenciasPendientes().size());
  }

  @Test
  void elUsuarioTieneUnaSugerenciaPendienteLuegoDeAprobar(){
    usuario.sugerenciasPendientes().get(0).aprobar();
    assertEquals(1, usuario.sugerenciasPendientes().size());
  }

  @Test
  void elUsuarioTieneUnAtuendoLuegoDeAprobar(){
    usuario.sugerenciasPendientes().get(0).aprobar();
    assertEquals(1, guardarropas.cantidadDeAtuendos());
  }

  @Test
  void elUsuarioDeshaceElUltimoCambio(){
    usuario.sugerenciasPendientes().get(0).aprobar();
    usuario.sugerencias().get(0).deshacerCambio();
    assertEquals(0, guardarropas.cantidadDeAtuendos());
  }
  
}
