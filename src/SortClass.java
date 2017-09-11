import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

/**
 * Created by khx on 17-9-12.
 */
public class SortClass implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        int result=0;
        DataBean d1=(DataBean)o1;
        DataBean d2=(DataBean)o2;
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
        try {
            Date data1=sdf.parse(d1.getDate()+" "+d1.getTime().split("~")[0]);
            Date data2=sdf.parse(d2.getDate()+" "+d2.getTime().split("~")[0]);
            if(data1.before(data2))
                result=-1;
            else
                result=1;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return result;
    }
}
