package ec.espe.siamch.patterns.factorymethod.product;

public class HtmlReport implements Report {
    @Override
    public void generate(String data) {
        System.out.println("Generando HTML con data: " + data);
    }
}
