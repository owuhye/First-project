package method;

public class MethodReturn1 {

    public static void main(String[] args) {
        boolean result = odd(3);
        System.out.println(result);
    }

    public static boolean odd(int i) {
        if (i % 2 == 1) {   // 나머지 1 : 홀수
            return true;    //if문은 아래로 빠져나가는데,
        } else{
            return false;
        }
    }
}
