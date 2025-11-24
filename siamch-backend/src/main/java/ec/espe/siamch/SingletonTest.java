package ec.espe.siamch;
import  ec.espe.siamch.patterns.Singleton.*;

public class SingletonTest {

    public static void main(String[] args) {

        ContaminantRegistry registry = ContaminantRegistry.getInstance();

        System.out.println("=== Registro inicial ===");
        registry.getAll().forEach((k, v) -> System.out.println(k + " -> " + v));

        registry.addContaminant("Nitratos", ContaminantType.HEREDADO);

        System.out.println("\n=== Después de agregar nuevo contaminante ===");
        registry.getAll().forEach((k, v) -> System.out.println(k + " -> " + v));

        // Probar que siempre devuelve la misma instancia
        ContaminantRegistry registry2 = ContaminantRegistry.getInstance();

        System.out.println("\n¿Es la misma instancia? " + (registry == registry2));
    }
}
