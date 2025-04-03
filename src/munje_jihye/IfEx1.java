package munje_jihye;

public class IfEx1 {
    int dollar = 1;


    public static void main(String[] args) {

//        int age =  6;
//
//        if(age <= 7 ){
//            System.out.println("미취학");
//        } else if (8 <= age && age <= 13) {
//            System.out.println("초등학생");
//        } else if (14 <= age && age <= 16) {
//            System.out.println("중학생");
//        } else if (17 <= age && age <= 19) {
//            System.out.println("고등학생");
//        } else {
//            System.out.println("성인");
//        }

//        int price = 12000;
//        int age = 10;
//        int discount = 0;
//
//        if (price >= 10000) {
//            discount += 1000;   // 1000
//            System.out.println("10000원 이상 구매, 1000원 할인");
//        }
//
//        if (age <= 10) {
//            discount += 1000;   // 1000 + 1000 = 2000원
//            System.out.println("어린이 1000원 할인");
//        }
//
//        System.out.println("총 할인 금액 : " + discount + "원");
//

//        int age = 10;
//        int price = 10000;
//        int discount = 0;
//
//        if (price >= 10000) {
//            discount += 1000;
//            System.out.println("10000원 이상 구매, 1000원 할인");
//        } else if (age <= 10) {
//            discount += 1000;
//            System.out.println("어린이 1000원 할인");
//        } else {
//            System.out.println("할인없음");
//        }
//        System.out.println("총 할인 금액 : " + discount + "원");
//
//    }

//        if (true) {
//            System.out.println("if문에서 실행됨");
//            System.out.println("if문에서 실행안됨");
//        }


//        int score = 100;
//
//        if (score >= 90) {
//            System.out.println("A");
//        } else if (score >= 80) {
//            System.out.println("B");
//        } else if (score >= 70) {
//            System.out.println("C");
//        } else if (score >= 60) {
//            System.out.println("D");
//        }else {
//            System.out.println("F");
//        }


        int distance = 50;

//        if(distance > 1 && distance <= 10){
//            System.out.println("도보");
//        } else if (distance  > 10 && distance <= 100) {
//            System.out.println("자전거");
//        } else if (distance >= 100) {
//            System.out.println("비행기");
//        } else {
//            System.out.println("도보");
//        }
//        System.out.println();

        if(distance <= 1){
            System.out.println("도보");
        } else if (distance <= 10) {
            System.out.println("자전거");
        } else if (distance <= 100) {
            System.out.println("자동차");
        }else{
            System.out.println("비행기");
        }


        int dollar = 10;


        if(dollar < 0){
            System.out.println("잘못된 금액입니다.");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        }else {
            int won = dollar * 1300;
            System.out.println("환전 금액은 " + won +" 입니다.");
        }

        double rating = 7.1;

        if(rating <= 9){
            System.out.println("'어바웃 타임'을 추천합니다.");
        }
        if(rating <= 8){
            System.out.println("'토이 스토리'를 추천합니다.");
        }
        if(rating <= 7){
            System.out.println("'고질라'를 추천합니다.");
        }
    }




}
