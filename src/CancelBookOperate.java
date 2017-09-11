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
        return checkTheRequestAttributesEnough(request)&&dateOperate.checkTheDateWhetherInvalid(request.split(" ")[1])&&dateOperate.checkTheTimeWhetherInvalid(request.split(" ")[2])&&checkTheSiteWhetherInvalid(request.split(" ")[3])&&checkTheCancelFlag(request.split(" ")[4]);
    }

    public boolean checkTheCancelFlag(String s) {
        return "C".equals(s);
    }

    public DataBean getDataBean() {
        return null;
    }
}
