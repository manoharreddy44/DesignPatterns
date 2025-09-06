package SOLIDPrinciples.SingleResponsibilityPrinciple.AfterSingleResponsibility;

public class Main {
    public static void main(String[] args) {
        Report report = new Report("Sales Data Q3");

        ReportSaver saver = new ReportSaver();
        saver.saveToFile(report, "sales_report.txt");

        ReportSender sender = new ReportSender();
        sender.sendEmail(report, "manager@company.com");
    }
}

