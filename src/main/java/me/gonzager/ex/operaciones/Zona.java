package me.gonzager.ex.operaciones;

public class Zona {
    private final Double tamañoTotal;
    private Integer operacionesRecibidas = 0;
    
    public Zona(Double tamañoTotal, Integer operacionesRecibidas) {
        this.tamañoTotal = tamañoTotal;
        this.operacionesRecibidas = operacionesRecibidas;
    }

    public Double getTamañoTotal() {
        return tamañoTotal;
    }

    public Integer getOperacionesRecibidas() {
        return operacionesRecibidas;
    }

    private Boolean puedeOperarSobreLaZona(Escuadron unEscuadron) {
        return unEscuadron.escuadronAvanzado() && unEscuadron.capacidadOperativaTotal() > this.getTamañoTotal();
    }

    public void sumarOperacion(){
        this.operacionesRecibidas += 1;
    }

    public void operacionSobreZona(Escuadron unEscuadron){
        if (this.puedeOperarSobreLaZona(unEscuadron)){
            this.sumarOperacion();
            unEscuadron.desgasteOperacion();
        }
    }

}
