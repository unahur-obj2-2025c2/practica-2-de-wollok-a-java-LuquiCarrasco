package me.gonzager.ex.operaciones;

import java.util.List;

public class DronSeguridad extends Drones{

    public DronSeguridad(Double autonomia, Integer nivelProcesamiento, Mision mision, List<Sensor> sensores) {
        super(autonomia, nivelProcesamiento, mision, sensores);
    }

    @Override
    public Boolean esAvanzado() {
        return this.getNivelProcesamiento() > 50 || this.getMision().requisitosAvanzado(this);
    }
    
}
