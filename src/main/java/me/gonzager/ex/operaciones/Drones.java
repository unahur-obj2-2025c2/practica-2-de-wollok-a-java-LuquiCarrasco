package me.gonzager.ex.operaciones;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public abstract class Drones {
    protected Double autonomia;
    private Integer nivelProcesamiento;
    private Mision mision;
    public List<Sensor> sensores = new ArrayList<>();
    
    public Drones(Double autonomia, Integer nivelProcesamiento, Mision mision) {
        this.autonomia = autonomia;
        this.nivelProcesamiento = nivelProcesamiento;
        this.mision = mision;
    }

    public Drones(Double autonomia, Integer nivelProcesamiento, Mision mision, List<Sensor> sensores) {
        this.autonomia = autonomia;
        this.nivelProcesamiento = nivelProcesamiento;
        this.mision = mision;
        this.sensores = sensores;
    }

    public Integer getNivelProcesamiento() {
        return nivelProcesamiento;
    }
    public void setNivelProcesamiento(Integer nivelProcesamiento) {
        this.nivelProcesamiento = nivelProcesamiento;
    }
    public Mision getMision() {
        return mision;
    }
    public void setMision(Mision mision) {
        this.mision = mision;
    }
    public Double getAutonomia() {
        return autonomia;
    }

    public void añadirSensor(Sensor sensor) {
        if (this.mision instanceof Vigilancia) {
        sensores.add(sensor);
    } else {
        System.out.println("No se pueden agregar sensores si la misión no es vigilancia.");
        }
    }

    public Stream<Sensor> sensoresConMejoras(){
        return  sensores.stream().filter(s -> s.getMejorasTecnologicas());
    } 

    public Integer sumaCapacidadSensoresMejoras(){
        return sensoresConMejoras().mapToInt(s -> s.getCapacidad()).sum();
    }

    public Stream<Sensor> sensoresSinMejoras(){
        return  sensores.stream().filter(s -> !s.getMejorasTecnologicas());
    }
    
    public Integer sumaCapacidadSensoresSinMejoras(){
        return sensoresSinMejoras().mapToInt(s -> s.getCapacidad()).sum();
    }

    public Double eficienciaOperativa(){
        return (autonomia * 10) + mision.extra(this);
    }

    public abstract Boolean esAvanzado();

    public void bajarAutonomia() {
        this.autonomia = this.autonomia - 2;
    }

}
