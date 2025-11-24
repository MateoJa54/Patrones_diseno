package ec.espe.siamch.patterns.abstractfactory.productos;

import ec.espe.siamch.domain.sensores.SensorTurbidez;

public class SensorTurbidezRio implements SensorTurbidez {

    @Override
    public double leerValor() {
        return 12.5;
    }

    @Override
    public String getDescripcion() {
        return "Sensor de Turbidez para entorno Río";
    }
}
