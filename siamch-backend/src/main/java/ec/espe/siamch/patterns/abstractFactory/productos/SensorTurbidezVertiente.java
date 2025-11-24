package ec.espe.siamch.patterns.abstractfactory.productos;

import ec.espe.siamch.domain.sensores.SensorTurbidez;

public class SensorTurbidezVertiente implements SensorTurbidez {

    @Override
    public double leerValor() {
        return 3.2;
    }

    @Override
    public String getDescripcion() {
        return "Sensor de Turbidez para entorno Vertiente";
    }
}
