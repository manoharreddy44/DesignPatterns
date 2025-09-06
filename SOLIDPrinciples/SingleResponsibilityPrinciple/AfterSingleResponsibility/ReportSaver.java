package SOLIDPrinciples.SingleResponsibilityPrinciple.AfterSingleResponsibility;

class ReportSaver {
    public void saveToFile(Report report, String filename) {
        System.out.println("Saving: " + report.generateReport() + " -> " + filename);
        // File writing logic here
    }
}
