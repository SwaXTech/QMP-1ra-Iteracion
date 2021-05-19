package com.qmp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.qmp.clima.AccuWeatherAPI;
import com.qmp.clima.BuenosAires;

import org.junit.jupiter.api.Test;

public class BuenosAiresTest {
  
  @Test
  void enBuenosAiresHace24Grados(){
    assertEquals(25, new BuenosAires().temperaturaCelsius());
  }
}
