/**
 * Created by khx on 17-9-11.
 */
public class DataBean {
    private String uId;
    private String date;
    private String time;
    private String site;
    private String incomeType;
    private double income;
    private String errorInfo;

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    public double getIncome() {

        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public String getIncomeType() {

        return incomeType;
    }

    public void setIncomeType(String incomeType) {
        this.incomeType = incomeType;
    }

    public String getSite() {

        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getTime() {

        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {

        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getuId() {

        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }
}
