package com.qmp.clima;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.qmp.RepositorioUsuarios;

public class RepositorioAlertas {

  private final List<Alerta> alertas = new ArrayList<>();
  private static final RepositorioAlertas INSTANCE = new RepositorioAlertas();

  private RepositorioAlertas(){}

  public static RepositorioAlertas getInstance() {
    return INSTANCE;
  }

  public List<String> getAlertasPara(String ciudad){
    return alertas.stream()
                  .filter(alerta -> alerta.esEstaCiudad(ciudad))
                  .map(alerta -> alerta.getAlerta())
                  .collect(Collectors.toList());
  }

  public void setAlertas(List<Alerta> alertas){
    alertas.clear();
    alertas.addAll(alertas);
    RepositorioUsuarios.getInstance().todos().forEach(usuario -> usuario.hayAlertasNuevas(alertas));
  }
  
  
}
