package me.gonzager.ex.operaciones;

//Singleton
public class CiudadFuturista {
    //Creamos una unica clase del Singleton
    private static CiudadFuturista instance = new CiudadFuturista();
    private Integer valor = 10 ;
    
    //Ocultar constructor
    private CiudadFuturista() {}

    //Definimos el getter de la instancia
    public static CiudadFuturista getInstance() {
        return instance;
    }

    //Definimos el getter y el setter del valor 
    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
}
