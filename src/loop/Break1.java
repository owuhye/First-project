package loop;

public class Break1 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (true) {
            sum = sum + i;
            if (sum > 10) { // → 참일 경우 밑에 코드 실행
                System.out.println("합이 10보다 크면 종료 : i=" + i + " sum=" + sum);
                break;
            }
            i++;
        }
    }
}
