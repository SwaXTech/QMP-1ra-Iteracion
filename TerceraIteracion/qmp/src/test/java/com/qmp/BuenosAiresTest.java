package com.qmp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.qmp.clima.AccuWeather;
import com.qmp.clima.BuenosAires;
import com.qmp.clima.RepositorioServicios;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BuenosAiresTest {

  @BeforeAll
  static void setup(){
    RepositorioServicios repo = RepositorioServicios.getInstance();
    AccuWeather accu = new AccuWeather();
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

}
