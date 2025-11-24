package ec.espe.siamch.patterns.abstractFactory.productos;

import ec.espe.siamch.domain.sensores.SensorPH;

public class SensorPHRio implements SensorPH {
    @Override
    public double leerValor() { return 7.1; }

    @Override
    public String getDescripcion() {
        return "Sensor de pH para entorno Río";
    }
}
