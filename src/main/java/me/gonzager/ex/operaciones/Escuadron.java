package me.gonzager.ex.operaciones;

import java.util.ArrayList;
import java.util.List;

public class Escuadron {
    private List<Drones> escuadron = new ArrayList<>();
    
    public Boolean escuadronAvanzado(){
        return escuadron.stream().anyMatch(d -> d.esAvanzado());
    }

    public Double capacidadOperativaTotal(){
        return escuadron.stream().mapToDouble(d -> d.eficienciaOperativa()).sum();
    }

    public void desgasteOperacion(){
        escuadron.stream().forEach(d -> d.bajarAutonomia());
    }

    public void agregarDronAlEscuadron(Drones dron){
        if (this.escuadron.size() < CiudadFuturista.getInstance().getValor()){
            escuadron.add(dron);
        }else{
            System.out.println("Supera la cantidad máxima definida por la ciudad.");
        }
    }

    public List<Drones> getEscuadron() {
        return escuadron;
    }

    
}
