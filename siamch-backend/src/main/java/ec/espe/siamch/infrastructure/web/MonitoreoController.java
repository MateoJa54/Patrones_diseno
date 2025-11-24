package ec.espe.siamch.infrastructure.web;

import ec.espe.siamch.application.ServicioMonitoreo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class MonitoreoController {

    private final ServicioMonitoreo servicioMonitoreo;

    public MonitoreoController(ServicioMonitoreo servicioMonitoreo) {
        this.servicioMonitoreo = servicioMonitoreo;
    }

    @GetMapping("/monitoreo/demo")
    public String demoMonitoreo() {
        return servicioMonitoreo.someOperation();
    }
}
