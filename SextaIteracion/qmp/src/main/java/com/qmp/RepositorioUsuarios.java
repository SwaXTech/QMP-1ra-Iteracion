package com.qmp;

import java.util.ArrayList;
import java.util.List;

public class RepositorioUsuarios {

  private final List<Usuario> usuarios = new ArrayList<>();
  private static final RepositorioUsuarios INSTANCE = new RepositorioUsuarios();

  private RepositorioUsuarios(){}

  public static RepositorioUsuarios getInstance() {
    return INSTANCE;
  }

  public List<Usuario> todos() {
    return usuarios;
  }
  
}
