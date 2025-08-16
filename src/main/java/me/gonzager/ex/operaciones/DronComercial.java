package me.gonzager.ex.operaciones;

public class DronComercial extends Drones{

    public DronComercial(Double autonomia, Integer nivelProcesamiento, Mision mision) {
        super(autonomia, nivelProcesamiento, mision);  
    }

    public Double eficienciaOperativa() {
        return super.eficienciaOperativa() + 15;
    }

    @Override
    public Boolean esAvanzado() {
        return false;
    }
}
