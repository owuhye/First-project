package munje_jihye;

public class CondOpEx2 {

    public static void main(String[] args) {


        int x = 2;
        String result = (x % 2 == 0) ? "짝수": "홀수";   // ? 참 표현식 : 거짓 표현식
        System.out.println("x =" + x + ", " + result
        );
    }
}
