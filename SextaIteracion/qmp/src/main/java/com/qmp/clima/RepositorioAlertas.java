package com.qmp.clima;

import java.util.ArrayList;
import java.util.List;

public class RepositorioAlertas {

  private final List<Alertas> alertas = new ArrayList<>();
  private static final RepositorioAlertas INSTANCE = new RepositorioAlertas();

  private RepositorioAlertas(){}

  public static RepositorioAlertas getInstance() {
    return INSTANCE;
  }

  public List<String> getAlertasPara(String ciudad){
    return alertas.stream()
                  .filter(alerta -> alerta.esEstaCiudad(ciudad))
                  .findAny().orElseThrow(() -> new RuntimeException("No hay alertas para esa ciudad"))
                  .getAlertas();
  }
  
  
}
