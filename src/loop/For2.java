package loop;

public class For2 {

    public static void main(String[] args) {
        int sum = 0; // 값 누적
        int endNum = 3;

        // sum = 1+2+3이 누적
        for(int i = 1; i <= endNum; i++){
            sum = sum + i;
            System.out.println("i= " + i + "," +" sum = " + sum);
        }
    }
}
