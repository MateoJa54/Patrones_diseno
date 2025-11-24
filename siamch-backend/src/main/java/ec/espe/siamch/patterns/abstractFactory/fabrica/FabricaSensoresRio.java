package ec.espe.siamch.patterns.abstractFactory.fabrica;

import ec.espe.siamch.domain.sensores.SensorPH;
import ec.espe.siamch.domain.sensores.SensorTurbidez;
import ec.espe.siamch.patterns.abstractFactory.productos.SensorPHRio;
import ec.espe.siamch.patterns.abstractFactory.productos.SensorTurbidezRio;
import org.springframework.stereotype.Component;

@Component("fabricaRio")
public class FabricaSensoresRio implements FabricaSensores {

    @Override
    public SensorPH createSensorPH() {
        return new SensorPHRio();
    }

    @Override
    public SensorTurbidez createSensorTurbidez() {
        return new SensorTurbidezRio();
    }
}
