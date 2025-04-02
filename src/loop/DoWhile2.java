package loop;

public class DoWhile2 {

    public static void main(String[] args) {
        int i = 10;

        do {
            System.out.println("현재 숫자는 : " + i); // 우선 실행을 해라 ( 참/거짓 떠나서 )
            i++;
        } while (i < 3); // 거짓 (whlie문 벗어남)

    }
}
