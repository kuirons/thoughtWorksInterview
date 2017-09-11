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
        return checkTheRequestAttributesEnough(request)&&dateOperate.checkTheDateWhetherInvalid(request.split(" ")[1])&&dateOperate.checkTheTimeWhetherInvalid(request.split(" ")[2])&&dateOperate.checkTheSiteWhetherInvalid(request.split(" ")[3]);
    }

    public DataBean getRequestBean() {
        return null;
    }
}
