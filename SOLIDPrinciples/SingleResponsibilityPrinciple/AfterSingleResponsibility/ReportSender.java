package SOLIDPrinciples.SingleResponsibilityPrinciple.AfterSingleResponsibility;

class ReportSender {
    public void sendEmail(Report report, String email) {
        System.out.println("Sending: " + report.generateReport() + " -> " + email);
        // Email sending logic here
    }
}
