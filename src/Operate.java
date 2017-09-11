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

    public boolean checkTheSiteWhetherInvalid(String site) {
        boolean flag=true;
        if(site.length()!=1)
            flag=false;
        else if(site.charAt(0)-'A'>3||site.charAt(0)-'A'<0)
            flag=false;
        return flag;
    }
}
