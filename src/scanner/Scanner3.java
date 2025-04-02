package scanner;

import java.util.Scanner;

public class Scanner3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int num1 = scanner.nextInt();

        System.out.print("정수를 입력하세요 : ");
        int num2 = scanner.nextInt();

        if(num1 > num2){
            System.out.println("두 개의 정수에서 큰 값은 : " + num1);
        }else if (num2 > num1){
            System.out.println("두 개의 정수에서 큰 값은 : " + num2);
        }else  {
            System.out.println("두 숫자는 같습니다.");
        }

    }
}
