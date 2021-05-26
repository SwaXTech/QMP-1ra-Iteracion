package com.qmp.uniforme;

import com.qmp.prenda.Prenda;

public interface Sastre {
  Prenda fabricarParteSuperior();
  Prenda fabricarParteInferior();
  Prenda fabricarCalzado();
  Uniforme crearUniforme();
}