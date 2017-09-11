import jdk.nashorn.internal.parser.DateParser;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created by khx on 17-9-11.
 */
public class DataBase {
    private ArrayList<DataBean> dataArrayList;
    private String info;

    DataBase() {
        dataArrayList=new ArrayList<DataBean>();
        info=null;
    }

    public void putInToDataBase(DataBean requestBean) {
        dataArrayList.add(requestBean);
    }

    public boolean checkTheRequestWhetherConflictDataBase(DataBean requestBean) {
        boolean flag=false;
        if("违约金".equals(requestBean.getIncomeType())){
            flag=cancelSearch(requestBean);
        }
        else{
            flag=bookSearch(requestBean);
        }
        if(flag==false)
            setInfo("Success: the booking is accepted!");
        return flag;
    }

    public boolean bookSearch(DataBean requestBean) {
        boolean flag=false;
        int flag1=0;
        for (DataBean dataBean :
                dataArrayList) {
            if(!("违约金".equals(dataBean.getIncomeType()))){
                if (dataBean.getSite().equals(requestBean.getSite())){
                    if(dataBean.getDate().equals(requestBean.getDate())){
                        int begin=Integer.valueOf(dataBean.getTime().split("~")[0].substring(0,2));
                        int end=Integer.valueOf(dataBean.getTime().split("~")[1].substring(0,2));
                        int rbegin=Integer.valueOf(requestBean.getTime().split("~")[0].substring(0,2));
                        int rend=Integer.valueOf(requestBean.getTime().split("~")[1].substring(0,2));
                        if(rend<=begin||rbegin>=end){
                        }
                        else {
                            flag1=1;
                        }
                    }
                }
            }
        }
        if(flag1==1){
            setInfo("Error: the booking conflicts with existing bookings!");
            flag=true;
        }
        return flag;
    }

    public boolean cancelSearch(DataBean requestBean) {
        boolean flag=true;
        int flag1=0;
        Iterator<DataBean> it=dataArrayList.iterator();
        while(it.hasNext()) {
            DataBean dataBean=it.next();
            if(!"违约金".equals(dataBean.getIncomeType())){
                if (dataBean.getuId().equals(requestBean.getuId())){
                    if(dataBean.getDate().equals(requestBean.getDate())){
                        if(dataBean.getTime().equals(requestBean.getTime())){
                            if(dataBean.getSite().equals(requestBean.getSite())){
                                it.remove();
                                flag=false;
                                flag1=1;
                                break;
                            }
                        }
                    }
                }
            }
        }
        if(flag1==0)
            setInfo("Error: the booking being cancelled does not exist!");
        return flag;
    }

    public void show() {
        ArrayList<DataBean> dataA=new ArrayList<DataBean>();
        ArrayList<DataBean> dataB=new ArrayList<DataBean>();
        ArrayList<DataBean> dataC=new ArrayList<DataBean>();
        ArrayList<DataBean> dataD=new ArrayList<DataBean>();
        double incomeA=0;
        double incomeB=0;
        double incomeC=0;
        double incomeD=0;
        for (DataBean dataBeans:
             dataArrayList) {
            switch (dataBeans.getSite().charAt(0)){
                case 'A':dataA.add(dataBeans);incomeA+=dataBeans.getIncome();break;
                case 'B':dataB.add(dataBeans);incomeB+=dataBeans.getIncome();break;
                case 'C':dataC.add(dataBeans);incomeC+=dataBeans.getIncome();break;
                case 'D':dataD.add(dataBeans);incomeD+=dataBeans.getIncome();break;
            }
        }
        System.out.println("收入汇总");
        System.out.println("---");
        print(dataA,incomeA,"A");
        print(dataB,incomeB,"B");
        print(dataC,incomeC,"C");
        print(dataD,incomeD,"D");
        System.out.println("---");
        System.out.println("总计: "+(new Double(incomeA+incomeB+incomeC+incomeD)).intValue()+"元");
    }

    public void print(ArrayList<DataBean> arrayListData,double income,String site){
        String type=null;
        SortClass sort=new SortClass();
        Collections.sort(arrayListData,sort);
        System.out.println("场地："+site);
        for (DataBean da :
                arrayListData) {
            if("违约金".equals(da.getIncomeType()))
                type="违约金";
            else
                type="";
            System.out.println(da.getDate() + " " + da.getTime() + " " + type + (int) da.getIncome()+"元");
        }
        System.out.println("小计:"+(new Double(income)).intValue()+"元");
        if(site.equals("D")){

        }
        else
            System.out.println();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
