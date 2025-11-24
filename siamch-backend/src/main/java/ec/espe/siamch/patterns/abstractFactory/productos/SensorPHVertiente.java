package ec.espe.siamch.patterns.abstractfactory.productos;

import ec.espe.siamch.domain.sensores.SensorPH;

public class SensorPHVertiente implements SensorPH {

    @Override
    public double leerValor() {
        return 6.8;
    }

    @Override
    public String getDescripcion() {
        return "Sensor de pH para entorno Vertiente";
    }
}
