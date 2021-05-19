package com.qmp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.qmp.clima.AccuWeatherAPI;
import com.qmp.clima.BuenosAires;

import org.junit.jupiter.api.Test;

public class BuenosAiresTest {
  
  @Test
  void enBuenosAiresHace25Grados(){
    assertEquals(25, new BuenosAires().temperaturaCelsius());
  }

  @Test
  void enBuenosAiresNoVaALlover(){
    assertEquals("0%", new BuenosAires().probabilidadDeLluvia());
  }

}
