package loop;

public class DoWhile1 {

    public static void main(String[] args) {
        int i = 10;
        while (i < 3) { //항상 거짓 10 < 3
            System.out.println("현재 숫자는 : " + i);
            i++;
        }
    }
}
