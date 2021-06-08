package com.qmp;

import java.time.LocalDate;

import com.qmp.clima.BuenosAires;
import com.qmp.clima.RepositorioServicios;
import com.qmp.prenda.Prenda;

public class PrendaDelDia {

  private Prenda prendaRecomendada;
  private LocalDate ultimoUpdate;
  private final PrendaDelDia INSTANCE = new PrendaDelDia();

  private PrendaDelDia() {}

  public void actualizarPrenda(){
    ultimoUpdate = LocalDate.now();
    int temperatura = RepositorioServicios.getInstance().getServicioActual().temperatura("Buenos Aires, Argentina");
    RepositorioPrendas.getINSTANCE().prendaPara(prenda -> prenda.esAptaPara(temperatura));
  }

  public PrendaDelDia getINSTANCE() {
    return INSTANCE;
  }

  public Prenda getPrendaRecomendada() {
    return prendaRecomendada;
  }





  
  
  
}
