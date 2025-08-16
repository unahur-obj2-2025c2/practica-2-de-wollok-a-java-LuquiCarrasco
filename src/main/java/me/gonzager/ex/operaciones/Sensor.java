package me.gonzager.ex.operaciones;
public class Sensor {
    private final Integer capacidad;        
    private final Double durabilidad;      
    private final Boolean mejorasTecnologicas;
    
    public Sensor(Integer capacidad, Double durabilidad, Boolean mejorasTecnologicas) {
        this.capacidad = capacidad;
        this.durabilidad = durabilidad;
        this.mejorasTecnologicas = mejorasTecnologicas;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public Double getDurabilidad() {
        return durabilidad;
    }

    public Boolean getMejorasTecnologicas() {
        return mejorasTecnologicas;
    }

    public Boolean esDuradero() {
        return durabilidad > capacidad * 2;
    } 
}
