package scanner;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;  // 사용자의 입력을 계속 더해야 하니까

        while(true){
            System.out.print("숫자를 입력하세요.(0입력하면 종료): ");
            int num = input.nextInt();

            if(num == 0){
                System.out.println("프로그램 종료");
                break;
            }

            sum += num;
        }
        System.out.println("입력한 모든 정수의 합: " + sum);

    }
}
