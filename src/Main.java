import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mode, check, inputAcc, inputMoney, outputMoney;
        ArrayList getNum = new ArrayList();
        Bank acc = new Bank();
        Account accField = new Account();
        while(true){
            System.out.println("============================================");
            System.out.println("안녕하세요 00은행입니다! 무엇을 도와드릴까요?");
            System.out.println("--------------------------------------------");
            System.out.println("1. 계좌생성 2. 입금 3. 출금 4. 잔액 조회  5. 종료");
            System.out.println("============================================");
            System.out.printf("모드 선택 : ");
            mode = sc.nextInt();
            if(mode == 1){
                //getNum = (ArrayList) accField.getNum();
                //acc.accoutCreate((ArrayList<Integer>) getNum);
                accField.setAccountNum();
                System.out.format("계좌주 : %s\n",accField.getHost());
                System.out.format("계좌 잔고 : %d원\n",accField.getMoney());
            } else if (mode == 2) {
                while(true) {
                    System.out.printf("계좌번호를 입력해주세요 : ");
                    inputAcc = sc.nextInt();
                    if(inputAcc == 1){
                        break;
                    }
                    System.out.printf("입금할 금액을 입력해주세요 : ");
                    inputMoney = sc.nextInt();
                    check = accField.plusMoney(inputAcc, inputMoney);
                    if (check == 1)
                        break;
                }
            } else if (mode == 3) {
                while(true) {
                    System.out.printf("계좌번호를 입력해주세요 : ");
                    inputAcc = sc.nextInt();
                    if(inputAcc == 1){
                        break;
                    }
                    System.out.printf("출금할 금액을 입력해주세요 : ");
                    outputMoney = sc.nextInt();
                    check = accField.moneyOut(inputAcc, outputMoney);
                    if(check == 1)
                        break;
                }
            } else if (mode == 4) {
                while(true) {
                    System.out.printf("계좌번호를 입력해주세요 : ");
                    inputAcc = sc.nextInt();
                    if(inputAcc == 1){
                        break;
                    }
                    check = accField.checkMoney(inputAcc);
                    if(check == 1){
                        break;
                    }
                }
            } else if(mode == 5){
                System.out.println("이용해주셔서 감사합니다!");
                return;
            }
            else{
                System.out.println("잘못된 입력입니다.");
            }
        }

    }
}