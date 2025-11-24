package ec.espe.siamch.patterns.abstractfactory.fabrica;

import ec.espe.siamch.domain.sensores.SensorPH;
import ec.espe.siamch.domain.sensores.SensorTurbidez;

public interface FabricaSensores {
    SensorPH createSensorPH();
    SensorTurbidez createSensorTurbidez();
}
