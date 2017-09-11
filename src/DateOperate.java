import java.text.SimpleDateFormat;

/**
 * Created by khx on 17-9-11.
 */
public class DateOperate {
    public boolean checkTheDateWhetherInvalid(String date){
        boolean flag=false;
        if(date==null||"".equals(date))
            flag=false;
        else
            flag=true;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        if (date.trim().length() != dateFormat.toPattern().length())
            flag=false;
        return flag;
    }

    public boolean checkTheTimeWhetherInvalid(String request) {
        return false;
    }

    public boolean checkTheSiteWhetherInvalid(String request) {
        return false;
    }
}
