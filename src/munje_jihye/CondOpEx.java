package munje_jihye;

public class CondOpEx {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int num = a < b ? b : a;  //내가 한 답

        int max = (a > b) ? a : b;

        System.out.println("더 큰 숫자는 " + max + "입니다.");
    }
}
