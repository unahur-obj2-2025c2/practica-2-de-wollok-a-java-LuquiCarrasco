package me.gonzager.ex.operaciones;

public class Transporte extends Mision {

    @Override
    public Integer extra(Drones drones) {
        return 100;
    }

    @Override
    public Boolean requisitosAvanzado(Drones drones) {
        return drones.getAutonomia() > 50;
    }
}
