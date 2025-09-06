package SOLIDPrinciples.SingleResponsibilityPrinciple.AfterSingleResponsibility;

class Report {
    private String content;

    public Report(String content) {
        this.content = content;
    }

    public String generateReport() {
        return "Report Content: " + content;
    }
}
