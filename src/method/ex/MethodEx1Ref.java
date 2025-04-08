package method.ex;

public class MethodEx1Ref {
    public static void main(String[] args) {
        //내가 푼 문제
//        avg(1, 2, 3);
//        avg(15, 25, 35);

        System.out.println("평균값 : " + average(1, 2, 3));
        System.out.println("평균값 : " + average(15, 25, 35));
    }

    //내가 푼 문제
//    public static double avg(int a, int b, int c) {
//        int sum = a + b + c;
//        double average = sum / 3.0;
//        System.out.println("평균값 : " + average);
//        return average;
//    }


    public static double average(int a, int b, int c) {
        int sum = a + b + c;
        return sum / 3.0 ;

    }

}
