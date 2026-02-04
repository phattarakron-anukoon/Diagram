import java.util.Date;

public class Report {
    private int report_code;
    private Date report_date;

    public Report(int report_code, Date report_date) {
        this.report_code = report_code;
        this.report_date = report_date;
    }

    public void viewReports() {
        System.out.println("View reports");
    }

    public void createReports() {
        System.out.println("Create reports");
    }
}