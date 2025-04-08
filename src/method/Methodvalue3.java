package method;

public class Methodvalue3 {

    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. changeNumber 호출 전, num1 : " + num1); // 5
        num1 = changeNumber(num1);  // num1의 값이 변경되었으면 좋겠다..
        System.out.println("1. changeNumber 호출 후, num1 : " + num1); // 10
    }

    public static int changeNumber(int num2) {
       num2 = num2 * 2;
       return num2;
    }
}
