import java.lang.reflect.Array;
import java.util.*;
import java.util.random.RandomGenerator;


public class Account {
    Bank bank = new Bank();
    int temp;
    private List<Integer> accountNum = new ArrayList<>();
    private List<String> accountHost = new ArrayList<>();
    private List<Integer> accountMoney = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public Integer getNum(){
        return accountNum.getLast();
    }

    public String getHost(){
        return accountHost.getLast();
    }

    public int getMoney(){
        return accountMoney.getLast();
    }

    public List<Integer> getNumArray(){
        return accountNum;
    }

    public List<String> getHostArray(){
        return accountHost;
    }

    public List<Integer> getMoneyArray(){
        return accountMoney;
    }
    public void setAccountNum(){
        temp = bank.accoutCreate((ArrayList<Integer>) accountNum);
        this.accountNum.add(temp);
        this.accountMoney.add(0);
        System.out.printf("본인의 이름을 입력하시오 : ");
        this.accountHost.add(sc.next());
    }

    public int plusMoney(int inputAcc, int money){
        int needIndex = accountNum.indexOf(inputAcc);
        if(needIndex != -1){
            accountMoney.set(needIndex, accountMoney.get(needIndex) + money);
            System.out.format("잔고 : %d원\n", accountMoney.get(needIndex));
            return 1;
        }
        else{
            System.out.println("해당하는 계좌는 존재하지 않습니다. 다시 시도해주세요.");
            System.out.println("뒤로가기 : 1 입력");
            return 0;
        }
    }

    public int checkMoney(int inputAcc){
        int checkIndex = accountNum.indexOf(inputAcc);
        if(checkIndex != -1){
            System.out.format("잔액 : %d원\n", accountMoney.get(checkIndex));
            return 1;
        }
        else{
            System.out.println("해당하는 계좌는 존재하지 않습니다. 다시 시도해주세요.");
            System.out.println("뒤로가기 : 1 입력");
            return 0;
        }
    }

    public int moneyOut(int inputAcc, int money){
        int outIndex = accountNum.indexOf(inputAcc);
        if(outIndex != -1) {
            if (accountMoney.get(outIndex) >= money) {
                accountMoney.set(outIndex, accountMoney.get(outIndex) - money);
                System.out.format("잔고 : %d원\n",accountMoney.get(outIndex));
                return 1;
            }
            else{
                System.out.println("잔고가 부족합니다. 다시 시도해주세요.");
                System.out.println("뒤로가기 : 1 입력");
                return 0;
            }
        }
        else{
            System.out.println("해당하는 계좌는 존재하지 않습니다. 다시 시도해주세요.");
            System.out.println("뒤로가기 : 1 입력");
            return 0;
        }
    }
}
