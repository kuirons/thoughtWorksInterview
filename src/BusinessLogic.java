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
            if(!dataBase.checkTheRequestWhetherConflictDataBase(operate.getRequestBean())){
                dataBase.putInToDataBase(operate.getRequestBean());
            }
        }
    }

    public void show(){
        for (String information :
                dataBase.getInformation()) {
            System.out.println(information);
        }
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
            businessLogic.doWork(line);
        }
        bufw.close();
    }
}
