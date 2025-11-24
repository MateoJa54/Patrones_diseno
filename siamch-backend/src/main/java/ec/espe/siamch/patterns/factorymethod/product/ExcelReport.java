package ec.espe.siamch.patterns.factorymethod.product;

public class ExcelReport implements Report {
    @Override
    public void generate(String data) {
        System.out.println("Generando Excel con data: " + data);
    }
}
