package com.qmp.clima;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BuenosAires {

  private Object valorDe(String key){
    AccuWeatherAPI apiClima = new AccuWeatherAPI();
    List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather("Buenos Aires, Argentina");  
    return condicionesClimaticas.get(0).get(key);
  }
  
  public String probabilidadDeLluvia(){ 
    return ((int)valorDe("PrecipitationProbability") * 100) + "%";
  }
  
  public int temperaturaCelsius(){
    HashMap<String, Object> temp = (HashMap<String, Object>) valorDe("Temperature");
    int tempFarenheit = (int) temp.get("Value");
    return tempFarenheit - 32;
  }
}
