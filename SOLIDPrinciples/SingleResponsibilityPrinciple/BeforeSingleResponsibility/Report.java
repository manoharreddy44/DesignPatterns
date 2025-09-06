package SOLIDPrinciples.SingleResponsibilityPrinciple.BeforeSingleResponsibility;

//Report class has 3 reasons to change.
//If file saving logic changes → this class changes.
//If email sending logic changes → this class changes.
//If report format changes → again this class changes.

class Report {
    private String content;

    public Report(String content) {
        this.content = content;
    }

   
    public String generateReport() {
        return "Report Content: " + content;
    }

    
    public void saveToFile(String filename) {
        System.out.println("Saving report to " + filename);
        
    }

    public void sendEmail(String email) {
        System.out.println("Sending report to " + email);
        
    }

    public static void main(String[] args) {
        Report report = new Report("Annual Financial Report");
        String reportContent = report.generateReport();
        System.out.println(reportContent);
        report.saveToFile("report.txt");
        report.sendEmail("example@example.com");
  
    }}
