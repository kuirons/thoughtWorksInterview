/**
 * Created by khx on 17-9-11.
 */
public class CancelBookOperate extends Operate {
    private DataBean dataBean;
    private DateOperate dateOperate;

    CancelBookOperate(){
        dataBean=new DataBean();
        dateOperate=new DateOperate();
    }

    public boolean checkTheRequestWhetherInvalid(String request) {
        boolean flag=checkTheRequestAttributesEnough(request)&&dateOperate.checkTheDateWhetherInvalid(request.split(" ")[1])&&dateOperate.checkTheTimeWhetherInvalid(request.split(" ")[2])&&checkTheSiteWhetherInvalid(request.split(" ")[3])&&checkTheCancelFlag(request.split(" ")[4]);
        if(!flag){
            dataBean.setErrorInfo("Error: the booking being cancelled does not exist!");
        }
        else
            setDataBean(request);
        return flag;
    }

    public boolean checkTheCancelFlag(String s) {
        return "C".equals(s);
    }

    public DataBean getDataBean() {
        return dataBean;
    }

    public void setDataBean(String request) {
        dataBean.setuId(request.split(" ")[0]);
        dataBean.setDate(request.split(" ")[1]);
        dataBean.setTime(request.split(" ")[2]);
        dataBean.setSite(request.split(" ")[3]);
        dataBean.setIncomeType("违约金");
        dataBean.setIncome(calculateTheDamages(dataBean));
    }

    private double calculateTheDamages(DataBean dataBean) {
        double result=calculateTheIncome(dataBean);
        if("weekend".equals(getWeekByDate(dataBean.getDate())))
            result=result*0.25;
        else
            result=result*0.5;
        return result;
    }
}
