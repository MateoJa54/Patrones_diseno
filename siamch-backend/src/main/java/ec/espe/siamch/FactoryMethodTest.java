package ec.espe.siamch;

import ec.espe.siamch.patterns.factorymethod.creator.*;

public class FactoryMethodTest {
    public static void main(String[] args) {

        ReportCreator pdfCreator = new PdfReportCreator();
        pdfCreator.someOperation("Datos ejemplo PDF");

        ReportCreator htmlCreator = new HtmlReportCreator();
        htmlCreator.someOperation("Datos ejemplo HTML");

        ReportCreator excelCreator = new ExcelReportCreator();
        excelCreator.someOperation("Datos ejemplo Excel");
    }
}
