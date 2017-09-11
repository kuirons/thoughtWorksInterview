/**
 * Created by khx on 17-9-11.
 */
public class BookOperate extends Operate{
    private DataBean dataBean;
    private DateOperate dateOperate;

    BookOperate(){
        dataBean=new DataBean();
        dateOperate=new DateOperate();
    }

    public boolean checkTheRequestWhetherInvalid(String request) {
        boolean flag = checkTheRequestAttributesEnough(request) && dateOperate.checkTheDateWhetherInvalid(request.split(" ")[1]) && dateOperate.checkTheTimeWhetherInvalid(request.split(" ")[2]) && checkTheSiteWhetherInvalid(request.split(" ")[3]);
        if (!flag)
            dataBean.setErrorInfo("Error: the booking is invalid!");
        else
            setDataBean(request);
        return flag;
    }

    public DataBean getDataBean() {
        return dataBean;
    }

    public void setDataBean(String request) {
        dataBean.setuId(request.split(" ")[0]);
        dataBean.setDate(request.split(" ")[1]);
        dataBean.setTime(request.split(" ")[2]);
        dataBean.setSite(request.split(" ")[3]);
        dataBean.setIncomeType("incomeflag");
        dataBean.setIncome(calculateTheIncome(dataBean));
    }
}
