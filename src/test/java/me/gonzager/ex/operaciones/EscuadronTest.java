package me.gonzager.ex.operaciones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class EscuadronTest {

    private Escuadron escuadron;
    private Drones dron1;
    private Drones dron2;
    private Sensor sensor1;

    private Mision mision1;
    private Mision mision2;
    private Mision mision3;

    private Zona zona1;
    

    @BeforeEach
    public void init() {
        escuadron = new Escuadron();
        mision1 = new Vigilancia();
        mision2 = new Exploracion();
        mision3 = new Transporte();
        sensor1 = new Sensor(20, 80.0, true);
        dron1 = new DronComercial(80.0, 60, mision1);
        dron2 = new DronSeguridad(80.0, 60, mision1);
        dron2.añadirSensor(sensor1);
        zona1 = new Zona(50.0, 0);
    }

    @Test()
    void agregarDronSiHayCapacidad() {
        escuadron.agregarDronAlEscuadron(dron1);
        assertTrue(escuadron.getEscuadron().contains(dron1));
    }

    @Test()
    void escuadradonNoAvanzado(){
        escuadron.agregarDronAlEscuadron(dron1);
        assertFalse(escuadron.escuadronAvanzado());
    }

    @Test()
    void escuadronAvanzado(){
        escuadron.agregarDronAlEscuadron(dron2);
        assertTrue(escuadron.escuadronAvanzado());
    }

    @Test()
    void dron1NoEsAvanzadoYDron2Si(){
        assertFalse(dron1.esAvanzado());
        assertTrue(dron2.esAvanzado());
    }
    
    @Test()
    void verSiPuedeOperarSobreUnaZona(){
        escuadron.agregarDronAlEscuadron(dron1);
        escuadron.agregarDronAlEscuadron(dron2);
        zona1.operacionSobreZona(escuadron);
        assertEquals(1, zona1.getOperacionesRecibidas());
        assertEquals(78.0, dron1.getAutonomia());
    }

}
