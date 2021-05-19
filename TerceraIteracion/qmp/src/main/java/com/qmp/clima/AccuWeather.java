package com.qmp.clima;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccuWeather implements ServicioClima{

  private List<Map<String, Object>> cache;
  private LocalDate lastUpdate;

  private Object valorDe(String lugar, String key){
    if(hayQueActualizar()){
      List<Map<String, Object>> condicionesClimaticas = consultarApi(lugar);  
      cache = condicionesClimaticas;
      lastUpdate = LocalDate.now();

      return condicionesClimaticas.get(0).get(key);
    }
    return cache.get(0).get(key);
  }

  private List<Map<String, Object>> consultarApi(String lugar) {
    AccuWeatherAPI apiClima = new AccuWeatherAPI();
    List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather(lugar);
    return condicionesClimaticas;
  }

  private boolean hayQueActualizar() {
    return cache == null || lastUpdate == null || lastUpdate.isBefore(LocalDate.now().minusDays(1));
  }

  @Override
  public int temperatura(String lugar) {
    HashMap<String, Object> temp = (HashMap<String, Object>) valorDe(lugar, "Temperature");
    return (int) temp.get("Value");
  }

  @Override
  public String probabilidadDeLluvias(String lugar) {
    return ((int)valorDe(lugar, "PrecipitationProbability") * 100) + "%";
  }
  
  
}
