package cond.ex;

public class EvenOddEx {

    public static void main(String[] args) {
        int x = 2;

        String result = ( x % 2 == 0) ? "짝수" : "홀수";
                     // 나머지가 == 0 (즉, 나머지가 없으면)
      /*
        2/2 = 1, 나머지 없음 → 짝수
        3/2 = 1, 나머지 1   → 홀수
        4/2 = 2, 나머지 없음 → 짝수
        5/2 = 2, 나머지 1   → 홀수
       */

        System.out.println("x = " + x + " , " + result);
    }
}
