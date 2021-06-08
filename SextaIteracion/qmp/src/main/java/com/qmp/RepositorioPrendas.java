package com.qmp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.qmp.prenda.Prenda;

public class RepositorioPrendas {

  private final List<Prenda> prendas = new ArrayList<>();
  private static final RepositorioPrendas INSTANCE = new RepositorioPrendas();

  public Prenda prendaPara(Predicate<Prenda> condicion){
    return prendas.stream().filter(condicion).findAny().orElseThrow(() -> new RuntimeException("No hay prendas que cumplan la condicion"));
  }

  public static RepositorioPrendas getINSTANCE() {
    return INSTANCE;
  }
  
}
