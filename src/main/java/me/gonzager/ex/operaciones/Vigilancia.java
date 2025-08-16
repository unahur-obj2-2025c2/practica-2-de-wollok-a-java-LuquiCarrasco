package me.gonzager.ex.operaciones;

public class Vigilancia extends Mision {

    @Override
    public Integer extra(Drones drones) {
        return (drones.sumaCapacidadSensoresMejoras() * 2 + drones.sumaCapacidadSensoresSinMejoras());
    }

    @Override
    public Boolean requisitosAvanzado(Drones drones) {
        return drones.sensores.stream().allMatch(s -> s.esDuradero());
    }  
}
