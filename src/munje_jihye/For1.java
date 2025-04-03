package munje_jihye;

public class For1 {

    public static void main(String[] args) {

//        for (int i = 1; i <= 10; i++) {  // 1.int i = 1 실행 2. i <= 10 조건식 true면 3.번 실행 , 4. i++ 증가 -> 2.증가한 i 다시 조건식으로 무한반복
//            System.out.println(i);
//        }
//
        int endNum = 5;
        int sum = 0;
//
        //for문장
//        for (int i = 1; i <= endNum; i++) {
//            sum += i;
//            System.out.println("i =" + i + ", sum = " + sum);
//        }

        int i = 1;

        //while 문장으로 변경
        while (i <= endNum) {
//            System.out.println(i);
            sum += i;
            System.out.println("i =" + i + ", sum = " + sum);
            i++;
        }
    }
}
