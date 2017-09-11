/**
 * Created by khx on 17-9-11.
 */
public class Operate {
    public boolean checkTheRequestWhetherInvalid(String request) {
        return false;
    }

    protected boolean checkTheRequestAttributesEnough(String request){
        return request.split(" ").length>3&&request.split(" ").length<6;
    }

    public DataBean getRequestBean() {
        return null;
    }
}
