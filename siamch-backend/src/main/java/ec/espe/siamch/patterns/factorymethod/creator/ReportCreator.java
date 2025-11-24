package ec.espe.siamch.patterns.factorymethod.creator;

import ec.espe.siamch.patterns.factorymethod.product.Report;

public abstract class ReportCreator {

    public void someOperation(String data) {
        Report report = createReport();
        report.generate(data);
    }

    public abstract Report createReport();
}
