import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mode;
        System.out.println("======================================");
        System.out.println("안녕하세요 00은행입니다! 무엇을 도와드릴까요?");
        System.out.println("--------------------------------------");
        System.out.println("1. 계좌생성\n2. 입금\n3. 출금\n4. 잔액 조회\n5. 종료");
        System.out.println("======================================");
        System.out.println("모드 선택 : ");
        mode = sc.nextInt();
        for (int i = 0; i < 15; i++)
            System.out.println("");

    }
}