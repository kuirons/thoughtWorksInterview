import java.io.*;

/**
 * Created by khx on 17-9-11.
 */
public class BusinessLogic {
    private DataBase dataBase;
    private Operate operate;

    BusinessLogic(){
        dataBase=new DataBase();
        operate=null;
    }

    public void doWork(String request){
        initialOperate(request);
        if(operate.checkTheRequestWhetherInvalid(request)){
            if(!dataBase.checkTheRequestWhetherConflictDataBase(operate.getDataBean())){
                    dataBase.putInToDataBase(operate.getDataBean());
                    System.out.println("Success: the booking is accepted!");
            }
            else
                System.out.println(dataBase.getInfo());
        }
        else {
            System.out.println(operate.getDataBean().getErrorInfo());
        }
    }

    public void show(){
        dataBase.show();
    }

    private void initialOperate(String request) {
        if(request.split(" ").length==5){
            operate=new CancelBookOperate();
        }else {
            operate=new BookOperate();
        }
    }


    public static void main(String[] args) throws IOException{
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));
        BusinessLogic businessLogic=new BusinessLogic();
        String line =null;
        while((line=bufr.readLine())!=null)    {
            if("over".equals(line))
                break;
            else if("".equals(line))
                businessLogic.show();
            else businessLogic.doWork(line);
        }
        bufw.close();
    }
}
