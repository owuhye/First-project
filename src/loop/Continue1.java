package loop;

public class Continue1 {

    public static void main(String[] args) {
        int i = 1;

        // i = 1, 2, 4, 5
        while (i <= 5) {
            if (i == 3) {
                i++;    // 4
                continue; // 다음 문장 건너 뛰고 while(조건식)으로 가기
            }
            System.out.println("i=" + i);
            i++;
        }
    }
}
