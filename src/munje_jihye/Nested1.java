package munje_jihye;

public class Nested1 {
    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
            System.out.println("외부 for문 시작 : "+ i);
            for (int j = 0; j < 3; j++) {
                System.out.println("-> 내부 for : " + i + " - " + j);
            }
            System.out.println("외부 for 종료 i : " + i);
            System.out.println();
        }

//        int count = 10;
//        for (int i = 1; i <= count; i++) {
//            System.out.println(i);
//        }

        for (int count = 1; count <= 10; count++) {
            System.out.println(count);
        }


//        int count2 = 0;
//        while (true) {
//            count2++;
//            if (count2 == 11) {
//                break;
//            }
//            System.out.println(count2);
//        }

        System.out.println();

        int countWhile = 1;
        while (true) {
            System.out.println(countWhile);
            countWhile++;
            if (countWhile == 11) {
                break;
            }
        }


        int count2 = 1;
        while (count2 <= 10) {
            System.out.println(count2);
            count2++;
        }


    }
}
