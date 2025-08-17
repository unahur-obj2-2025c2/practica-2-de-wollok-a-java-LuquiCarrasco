package me.gonzager.ex.operaciones;

public class DronSeguridad extends Drones{

    public DronSeguridad(Double autonomia, Integer nivelProcesamiento, Mision mision) {
        super(autonomia, nivelProcesamiento, mision);
    }

    @Override
    public Boolean esAvanzado() {
        return this.getNivelProcesamiento() > 50 || this.getMision().requisitosAvanzado(this);
    }
    
}
