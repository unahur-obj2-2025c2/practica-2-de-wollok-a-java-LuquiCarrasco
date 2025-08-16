package me.gonzager.ex.operaciones;

public class Exploracion extends Mision {

    @Override
    public Integer extra(Drones drones) {
        return 0;
    }

    @Override
    public Boolean requisitosAvanzado(Drones drones) {
        return drones.eficienciaOperativa() % 2 == 0;
    }
}
