package com.qmp;

public enum TipoAlerta {

  STORM{
    @Override
    public String message(){
      return "Llevate el paraguas";
    }
  },

  HAIL{
    @Override
    public String message(){
      return "No saques el auto";
    }
  };

  public abstract String message();
}
