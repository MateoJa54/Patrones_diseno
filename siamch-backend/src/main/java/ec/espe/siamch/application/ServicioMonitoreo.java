package ec.espe.siamch.application;

import ec.espe.siamch.domain.sensores.SensorPH;
import ec.espe.siamch.domain.sensores.SensorTurbidez;
import ec.espe.siamch.patterns.abstractfactory.fabrica.FabricaSensores;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ServicioMonitoreo {

    private final FabricaSensores fabricaSensores;

    public ServicioMonitoreo(@Qualifier("fabricaRio") FabricaSensores fabricaSensores) {
        this.fabricaSensores = fabricaSensores;
    }

    public String someOperation() {
        SensorPH sensorPH = fabricaSensores.createSensorPH();
        SensorTurbidez sensorTurbidez = fabricaSensores.createSensorTurbidez();

        double valorPH = sensorPH.leerValor();
        double valorTurbidez = sensorTurbidez.leerValor();

        return """
               Entorno monitoreado:
               - %s -> pH = %.2f
               - %s -> Turbidez = %.2f
               """.formatted(
                sensorPH.getDescripcion(), valorPH,
                sensorTurbidez.getDescripcion(), valorTurbidez
        );
    }
}
