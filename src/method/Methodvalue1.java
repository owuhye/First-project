package method;

public class Methodvalue1 {

    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1. changeNumber 호출 전, num1 : " + num1); // 5
        changeNumber(num1); //10
        System.out.println("1. changeNumber 호출 후, num1 : " + num1);
    }

    public static void changeNumber(int num2) {
        System.out.println("2. changeNumber 변경 전, num2 : " + num2); // 5
        num2 = num2 * 2; // 10
        System.out.println("3. changeNumber 변경 전, num2 : " + num2); // 10
    }
}
