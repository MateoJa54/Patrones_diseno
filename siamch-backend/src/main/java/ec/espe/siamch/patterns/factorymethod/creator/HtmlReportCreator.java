package ec.espe.siamch.patterns.factorymethod.creator;

import ec.espe.siamch.patterns.factorymethod.product.*;

public class HtmlReportCreator extends ReportCreator {

    @Override
    public Report createReport() {
        return new HtmlReport();
    }
}
