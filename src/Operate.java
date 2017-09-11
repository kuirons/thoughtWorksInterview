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
        double result=0.0;
        int begin=Integer.valueOf(dataBean.getTime().split("~")[0].substring(0,2));
        int end=Integer.valueOf(dataBean.getTime().split("~")[1].substring(0,2));
        if("weekend".equals(getWeekByDate(dataBean.getDate()))){
            int begina =searchTheBeginTimeInterval(dataBean.getTime().split("~")[0]);
            int endb=searchTheEndTimeInterval(dataBean.getTime().split("~")[1]);
            if(endb- begina <0){
                switch (begin){
                    case 12:result+=40.0*(end- begin);break;
                    case 18:result+=50.0*(end- begin);break;
                    case 20:result+=60.0*(end- begin);break;
                    default:result+=60.0*(end- begin);break;
                }
            }else if(endb- begina ==0){
                switch (begina){
                    case 12:result=40.0*(12- begin)+50*(end-12);break;
                    case 18:result=50.0*(18- begin)+60*(end-18);break;
                    case 20:result=60.0*(20- begin)+60*(end-20);break;
                    default:break;
                }
            }
            else if(endb- begina ==6){
                result=40.0*(12- begin)+300.0+60.0*(end-18);
            }
            else if(endb- begina ==2){
                result=50.0*(18- begin)+120.0+60.0*(end-20);
            }
            else {
                result=40.0*(12- begin)+420.0+60*(end-20);
            }
        }
        else{
            int begina =searchTheBeginTimeInterval(dataBean.getTime().split("~")[0]);
            int endb=searchTheEndTimeInterval(dataBean.getTime().split("~")[1]);
            if(endb- begina <0){
                switch (begina){
                    case 12:result+=30.0*(end- begin);break;
                    case 18:result+=50.0*(end- begin);break;
                    case 20:result+=80.0*(end- begin);break;
                    default:result+=60.0*(end- begin);break;
                }
            }else if(endb- begina ==0){
                switch (begina){
                    case 12:result=30.0*(12- begin)+50*(end-12);break;
                    case 18:result=50.0*(18- begin)+80*(end-18);break;
                    case 20:result=80.0*(20- begin)+60*(end-20);break;
                    default:break;
                }
            }
            else if(endb- begina ==6){
                result=30.0*(12- begin)+300.0+80.0*(end-18);
            }
            else if(endb- begina ==2){
                result=50.0*(18- begin)+160.0+60.0*(end-20);
            }
            else {
                result=30.0*(12- begin)+460.0+60*(end-20);
            }
        }
        return result;
    }

    private int searchTheEndTimeInterval(String s) {
        int result=0;
        if(dateOperate.checkTheTimeBetweenInterval("2017-09-11 09:00","2017-09-11 12:00","2017-09-11 "+s))
            result=9;
        else if(dateOperate.checkTheTimeBetweenInterval("2017-09-11 12:00","2017-09-11 18:00","2017-09-11 "+s))
            result=12;
        else if(dateOperate.checkTheTimeBetweenInterval("2017-09-11 18:00","2017-09-11 20:00","2017-09-11 "+s))
            result=18;
        else
            result=20;
        return result;
    }

    private int searchTheBeginTimeInterval(String s) {
        int result=0;
        if(dateOperate.checkTheTimeBetweenInterval("2017-09-11 09:00","2017-09-11 12:00","2017-09-11 "+s))
            result=12;
        else if(dateOperate.checkTheTimeBetweenInterval("2017-09-11 12:00","2017-09-11 18:00","2017-09-11 "+s))
            result=18;
        else if(dateOperate.checkTheTimeBetweenInterval("2017-09-11 18:00","2017-09-11 20:00","2017-09-11 "+s))
            result=20;
        else
            result=22;
        return result;
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
