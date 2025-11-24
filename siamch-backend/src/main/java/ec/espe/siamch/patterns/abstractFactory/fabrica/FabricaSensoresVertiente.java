package ec.espe.siamch.patterns.abstractfactory.fabrica;

import ec.espe.siamch.domain.sensores.SensorPH;
import ec.espe.siamch.domain.sensores.SensorTurbidez;
import ec.espe.siamch.patterns.abstractfactory.productos.SensorPHVertiente;
import ec.espe.siamch.patterns.abstractfactory.productos.SensorTurbidezVertiente;
import org.springframework.stereotype.Component;

@Component("fabricaVertiente")
public class FabricaSensoresVertiente implements FabricaSensores {

    @Override
    public SensorPH createSensorPH() {
        return new SensorPHVertiente();
    }

    @Override
    public SensorTurbidez createSensorTurbidez() {
        return new SensorTurbidezVertiente();
    }
}
