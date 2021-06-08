package com.qmp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.qmp.clima.AccuWeather;
import com.qmp.clima.BuenosAires;
import com.qmp.clima.RepositorioServicios;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BuenosAiresTest {

  static RepositorioServicios repo;

  @BeforeAll
  static void setup(){
    repo = RepositorioServicios.getInstance();
    AccuWeather accu = mock(AccuWeather.class);
    when(accu.temperatura("Buenos Aires, Argentina")).thenReturn(25 + 32);
    when(accu.probabilidadDeLluvias("Buenos Aires, Argentina")).thenReturn("0%");
    when(accu.gastoActual()).thenReturn(5.0);

    repo.agregarServicio(accu);
    repo.setServicioActual(accu);

  }
  
  @Test
  void enBuenosAiresHace25Grados(){
    assertEquals(25, new BuenosAires().temperaturaCelsius());
  }

  @Test
  void enBuenosAiresNoVaALlover(){
    assertEquals("0%", new BuenosAires().probabilidadDeLluvia());
  }

  @Test
  void elGastoFueDe5USD(){
    new BuenosAires().probabilidadDeLluvia();
    new BuenosAires().probabilidadDeLluvia();
    assertEquals(5.0, repo.getServicioActual().gastoActual());
  }

}
