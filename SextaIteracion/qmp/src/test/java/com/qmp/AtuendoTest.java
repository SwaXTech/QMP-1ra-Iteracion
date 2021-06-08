package com.qmp;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Arrays;

import com.qmp.atuendo.Atuendo;
import com.qmp.clima.AccuWeather;
import com.qmp.clima.Ciudad;
import com.qmp.clima.RepositorioServicios;
import com.qmp.prenda.Categoria;
import com.qmp.prenda.Color;
import com.qmp.prenda.Prenda;
import com.qmp.prenda.TipoDePrenda;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class AtuendoTest {

  @BeforeAll
  static void setup(){
    RepositorioServicios repo = RepositorioServicios.getInstance();
    AccuWeather accu = new AccuWeather();
    repo.agregarServicio(accu);
    repo.setServicioActual(accu);

  }
  
  @Test
  void ropaDeInviernoNoEsSugerible(){
    Atuendo atuendo = new Atuendo(
      new Prenda(new TipoDePrenda(Categoria.PARTE_SUPERIOR), null, new Color(0,0,0), null, null, 10, Arrays.asList(new String[]{"STORM"})),
      new Prenda(new TipoDePrenda(Categoria.PARTE_INFERIOR), null, new Color(0,0,0), null, null, 10, Arrays.asList(new String[]{"STORM"})),
      new Prenda(new TipoDePrenda(Categoria.CALZADO), null, new Color(0,0,0), null, null, 10, Arrays.asList(new String[]{"STORM"})),
      new Prenda(new TipoDePrenda(Categoria.ACCESORIO), null, new Color(0,0,0), null, null, 10, Arrays.asList(new String[]{"STORM"}))
    );

    assertFalse(atuendo.esSugerible(new Ciudad("Buenos Aires, Argentina")));
  }
}
