import java.util.ArrayList;
import java.util.Random;

public class Bank {
    //ArrayList accountNum = new ArrayList();
    int temp;
    String hostName;
    int money;
    Random r = new Random();

    public int accoutCreate(ArrayList<Integer> accNum){
        r.setSeed(System.currentTimeMillis());
        while(true) {
            temp = (r.nextInt(89999999)+10000000);
            if (accNum.contains(temp)) {
                continue;
            }
            else{
                break;
            }
        }
        //temp = (int) accountNum.get(accountNum.size()-1);
        System.out.format("생성된 계좌번호 : %04d-%04d\n",temp/10000, temp%10000);
        return temp;
    }
}
