package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {  // 반복 계속 돌려야한다.
            System.out.print("이름을 입력하세요 ( 종료를 입력하면 종료): ");
            String name = scanner.nextLine();

            if(name.equals("종료")) {
                System.out.print("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요 ( 종료를 입력하면 종료): ");
            int age = scanner.nextInt(); // '10\n' -> '10'만 읽음  -> '\n' 이 남음
            scanner.nextLine(); // '\n' 읽고, 버린다.

            System.out.println("입력한 이름: " + name + ", 나이: " + age );

        }
    }
}
