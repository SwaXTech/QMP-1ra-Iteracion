package com.qmp;

import java.util.ArrayList;
import java.util.List;

import com.qmp.clima.Ciudad;
import com.qmp.otros_servicios.MailSender;
import com.qmp.otros_servicios.NotificationService;

public class RepositorioUsuarios {

  private final List<Usuario> usuarios = new ArrayList<>();
  private static final RepositorioUsuarios INSTANCE = new RepositorioUsuarios();

  private RepositorioUsuarios(){}

  public static RepositorioUsuarios getInstance() {
    return INSTANCE;
  }

  public void notificarUsuarios(NotificationService notiService, MailSender sender, Ciudad ciudad, String mensaje){
    usuarios.stream().filter(usuario -> usuario.getCiudad().equals(ciudad.getNombre()))
                     .forEach(usuario -> usuario.serNotificado(notiService, sender, mensaje));
  }
  
}
