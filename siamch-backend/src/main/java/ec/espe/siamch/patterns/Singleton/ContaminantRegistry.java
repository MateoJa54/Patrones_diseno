package ec.espe.siamch.patterns.Singleton;
import java.util.HashMap;
import java.util.Map;

public class ContaminantRegistry {
    private static ContaminantRegistry instance;
    private Map<String, ContaminantType> contaminantes = new HashMap<>();

    private ContaminantRegistry() {
        contaminantes.put("Mercurio", ContaminantType.HEREDADO);
        contaminantes.put("Plomo", ContaminantType.HEREDADO);
        contaminantes.put("Microplásticos", ContaminantType.EMERGENTE);
        contaminantes.put("Fármacos", ContaminantType.EMERGENTE);
    }


    public static ContaminantRegistry getInstance() {
        if (instance == null) {
            instance = new ContaminantRegistry();
        }
        return instance;
    }

    public void addContaminant(String nombre, ContaminantType tipo) {
        contaminantes.put(nombre, tipo);
    }

    public ContaminantType getType(String nombre) {
        return contaminantes.get(nombre);
    }

    public Map<String, ContaminantType> getAll() {
        return contaminantes;
    }
}
