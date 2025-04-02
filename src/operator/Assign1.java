package operator;

public class Assign1 {

    public static void main(String[] args) {

        // 8 만들기
        int a = 5;

        a += 3; // a를 3이랑 더하기 ( 5 + 3 )  -> 나온 값을 대입하기  a = 8     * 더하고 대입
        System.out.println(a);

        a -= 2; // a - 3 (8 - 2 = 6) -> a = 6 대입            * 뺴고 대입
        System.out.println(a);

        a *= 4; // a * 4 (6 * 4 = 24) -> a = 24 대입            * 곱하고 대입
        System.out.println(a);

        a /= 3; // a / 3 ( 24 / 3 = 8) -> a = 8 대입            * 나누고 대입
        System.out.println(a);

        a %= 5; // a % 5 (8 % 5 = 3) -> a = 3 대입               * 나누고 나머지 값 대입
        System.out.println(a);

        System.out.println();

        // 10 만들기
        int x = 10;

        x *= 4;
        System.out.println(x);
    }
}
