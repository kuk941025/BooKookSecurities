package BooKookSecurities.Model;

public class Setting {
    private String recipient_mail, report_path;
    private boolean isStartProgram;
    private int limit_year, limit_month, limit_day, time_period_hrs;

    public Setting() {
    }

    public int getTime_period_hrs() {
        return time_period_hrs;
    }

    public void setTime_period_hrs(int time_period_hrs) {
        this.time_period_hrs = time_period_hrs;
    }

    public String getRecipient_mail() {
        return recipient_mail;
    }

    public void setRecipient_mail(String recipient_mail) {
        this.recipient_mail = recipient_mail;
    }

    public String getReport_path() {
        return report_path;
    }

    public void setReport_path(String report_path) {
        this.report_path = report_path;
    }

    public boolean isStartProgram() {
        return isStartProgram;
    }

    public void setStartProgram(boolean startProgram) {
        isStartProgram = startProgram;
    }

    public int getLimit_year() {
        return limit_year;
    }

    public void setLimit_year(int limit_year) {
        this.limit_year = limit_year;
    }

    public int getLimit_month() {
        return limit_month;
    }

    public void setLimit_month(int limit_month) {
        this.limit_month = limit_month;
    }

    public int getLimit_day() {
        return limit_day;
    }

    public void setLimit_day(int limit_day) {
        this.limit_day = limit_day;
    }
}
