package munje_jihye;

public class Break2 {
    public static void main(String[] args) {

        int sum = 0;

//        for (int i = 1; i < 10; i++) {
//            sum += i;
//            if (sum > 10) {
//                System.out.println("sum = " + sum);
//                break;
//            }
//            System.out.println();
//        }

//        int i = 1;
//        for (; ; ) {
//            sum += i;
//            if (sum > 10) {
//                System.out.println("sum = " + sum);
//                break;
//            }
//            i++;    // 증감을 해줘야 i가 반복횟수만큼 서서히 증가함
//        }

        for (int i = 1; ; i++) {
            sum += i;
            if (sum > 10) {
                System.out.println("sum = " + sum);
                break;
            }
        }
    }
}
