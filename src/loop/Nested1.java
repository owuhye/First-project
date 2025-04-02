package loop;

public class Nested1 {

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            System.out.println("외부 for 시작 i:" + i);
            for (int j = 0; j < 3; j++) {
                System.out.println("-> 내부 for " + i + " - " + j);
            } // → j = 3 이면 여기를 벗어남
            System.out.println("외부 for 종료 i : " + i); // → for문 i 구문 안에 있는 문장
            System.out.println();                       // → for문 i 구문 안에 있는 문장
        }
    }
}
