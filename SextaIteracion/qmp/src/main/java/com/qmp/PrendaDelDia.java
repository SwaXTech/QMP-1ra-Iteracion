package com.qmp;

import java.time.LocalDate;
import java.util.List;

import com.qmp.clima.Ciudad;
import com.qmp.prenda.Prenda;

public class PrendaDelDia {

  private List<PrendaRecomendada> prendasRecomendadas;
  private LocalDate ultimoUpdate;
  private final PrendaDelDia INSTANCE = new PrendaDelDia();

  private PrendaDelDia() {}

  public void actualizarPrenda(){
    ultimoUpdate = LocalDate.now();
    prendasRecomendadas.forEach(PrendaRecomendada::actualizarPrenda);
  }

  public PrendaDelDia getINSTANCE() {
    return INSTANCE;
  }

  public Prenda getPrendaRecomendada(String ciudad) {
    return prendasRecomendadas.stream()
                .filter(prendaRecomendada -> prendaRecomendada.esEstaCiudad(ciudad))
                .findAny().orElseThrow(() -> new RuntimeException("No hay ciudades cargadas"))
                .getPrenda();
  }

  public void agregarCiudad(Ciudad ciudad){
    prendasRecomendadas.add(new PrendaRecomendada(ciudad));
  }
  
  
}
