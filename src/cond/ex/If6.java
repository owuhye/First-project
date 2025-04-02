package cond.ex;

public class If6 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000){
            discount = discount + 1000;
            System.out.println("가격 1000원 할인");
        } else if (age <= 10) {
            discount = discount + 1000;
            System.out.println("1000원 할인");
        } else {
            System.out.println("할인없음");
        }

        System.out.println("총 할인 금액은 " + discount + "원 입니다.");


        if (true)
            System.out.println("실행OK");
            System.out.println("실행X");


        if (false)
            System.out.println("실행OK"); // false라서 한줄 실행x
            System.out.println("실행X"); // 이것만 실행

    }
}
