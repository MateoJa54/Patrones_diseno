package ec.espe.siamch.patterns.factorymethod.product;

public class PdfReport implements Report {
    @Override
    public void generate(String data) {
        System.out.println("Generando PDF con data: " + data);
    }
}
