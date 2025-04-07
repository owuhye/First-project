package array.ex;

import java.util.Scanner;

public class ProductAdminEx {

    public static void main(String[] args) {
        int maxProducts = 3;
        String[] productNames  = new String[maxProducts]; //상품 최대 10개까지 저장 가능
        int[] productPrices = new int[maxProducts] ;
        int productCount = 0;   //상품이 한개씩 올라갈 예정

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("1. 상품등록 | 2. 상품목록 | 3. 종료\n메뉴를 선택하세요.:");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {

                if (productCount >= maxProducts) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue; // 10개가 넘으면 while문으로 가야한다. continue을 적어서 아래부분은 안읽고 while문으로 올라 간다.
                }
                System.out.print("상품 이름을 입력하세요:");
                productNames[productCount] = scanner.nextLine();


                System.out.print("상품 가격을 입력하세요:");
                productPrices[productCount] = scanner.nextInt();

                productCount++; // 증가 : productPrices[0] , productNames[0]는 처음에 0으로 초기화 하였는데, 증가를 안하면 계속 [0]에 상품이 등록된다.
            }else if (menu == 2) {
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                //for문을 이용해서 출력
                for (int i = 0; i <productCount; i++) {
                    System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                }
                System.out.print("상품 목록입니다.");

            } else if (menu == 3) {
                System.out.println("종료");
                break;
            } else {
                System.out.println("잘못된 메뉴를 선택하셨습니다.");
            }
        }
    }
}
