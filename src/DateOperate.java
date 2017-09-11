import java.text.ParseException;
import java.text.SimpleDateFormat;

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

    public boolean checkTheTimeWhetherInvalid(String request) {
        return false;
    }

    public boolean checkTheSiteWhetherInvalid(String request) {
        return false;
    }
}
