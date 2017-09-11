import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by khx on 17-9-11.
 */
public class Operate {
    private DateOperate dateOperate;

    Operate(){
        dateOperate=new DateOperate();
    }

    public boolean checkTheRequestWhetherInvalid(String request) {
        return false;
    }

    protected boolean checkTheRequestAttributesEnough(String request){
        return request.split(" ").length>3&&request.split(" ").length<6;
    }

    public DataBean getDataBean() {
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
    public double calculateTheIncome(DataBean dataBean){
        if("weekend".equals(getWeekByDate(dataBean.getDate()))){

        }
        return 0.0;
    }

    public String getWeekByDate(String date) {
        String result="weekflag";
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        try {
            Date d=new SimpleDateFormat("yyyy-MM-dd").parse(date);
            String week = sdf.format(d);
            if("Saturday".equals(week)||"Sunday".equals(week))
                result="weekend";
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return result;
    }
}
