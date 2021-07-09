package com.qmp;

public class TareaSugerenciaDiaria {

  void enviarSugerenciaDiaria(){
    RepositorioUsuarios.getInstance().todos().forEach(
      usuario -> usuario.actualizarSugerenciaDiaria()
    );
  }
  
}
