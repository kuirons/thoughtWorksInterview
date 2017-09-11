import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by khx on 17-9-11.
 */
public class DateOperate {
    public boolean checkTheDateWhetherInvalid(String date){
        boolean flag=true;
        if(date==null||"".equals(date))
            flag=false;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        if (date.trim().length() != dateFormat.toPattern().length())
            flag=false;
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(date.trim());
        }
        catch (ParseException pe) {
            flag=false;
        }
        return flag;
    }

    public boolean checkTheTimeWhetherInvalid(String time) {
        return checkTheTimeBetweenInterval("2017-09-11 09:00","2017-09-11 22:00","2017-09-11 "+time)&&checkTheTimeWhetherPunctuality(time);
    }

    public boolean checkTheTimeWhetherPunctuality(String time) {
        boolean flag=true;
        if(time.length()<5)
            flag=false;
        else
            flag="00".equals(time.substring(3,5));
        return flag;
    }

    public boolean checkTheSiteWhetherInvalid(String site) {
        boolean flag=true;
        if(site.length()!=1)
            flag=false;
        else if(site.charAt(0)-'A'>3||site.charAt(0)-'A'<0)
            flag=false;
        return flag;
    }
    public boolean checkTheTimeBetweenInterval(String beginTime,String endTime,String testTime) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        dateFormat.setLenient(false);
        boolean flag = true;
        if (testTime == null || testTime == "") {
            flag = false;
        } else if (testTime.trim().length() != dateFormat.toPattern().length()) {
            flag = false;
        }
        else{
            try {
                Date beginD = dateFormat.parse(beginTime);
                Date endD = dateFormat.parse(endTime);
                Date testD = dateFormat.parse(testTime);
                if (beginD.after(testD) || endD.before(testD))
                    flag = false;
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return flag;
    }

}
