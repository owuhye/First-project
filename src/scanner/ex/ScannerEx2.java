package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하세요.: ");
        int number = scanner.nextInt();

        if(number % 2 == 0){    // number를 2로 나눴을 때 0 이 나오면 짝수 라는 의미
            System.out.println("입력한 숫자는 " + number + ", 짝수입니다. ");
        } else {
            System.out.println("입력한 숫자는 " + number + ", 홀수입니다. ");
        }
    }
}
