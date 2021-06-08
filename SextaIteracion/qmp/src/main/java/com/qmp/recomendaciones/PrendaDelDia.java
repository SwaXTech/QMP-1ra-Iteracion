package com.qmp.recomendaciones;

import java.time.LocalDate;
import java.util.List;

import com.qmp.clima.Ciudad;
import com.qmp.prenda.Prenda;

public class PrendaDelDia {

  private List<PrendaRecomendada> prendasRecomendadas;
  private LocalDate ultimoUpdate;
  private static final PrendaDelDia INSTANCE = new PrendaDelDia();

  private PrendaDelDia() {}

  public void actualizarPrendas(){
    ultimoUpdate = LocalDate.now();
    prendasRecomendadas.forEach(PrendaRecomendada::actualizarPrenda);
  }

  public static PrendaDelDia getINSTANCE() {
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

  public LocalDate getUltimoUpdate() {
    return ultimoUpdate;
  }
  
  
}
