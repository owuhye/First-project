package method.ex;

public class MethodEx2Ref {
    public static void main(String[] args) {
        String message = "Hello, world!";

        printMessage(message, 4);
//       printMessage("Hello, world!", 14);
        printMessage("java", 3);
        printMessage("spring", 2);
    }
    public static void printMessage(String message, int times) {    //반환 값은 없고 출력만 하면 된다. (void), items는 메세지를 몇번 돌릴거냐
        for (int i = 1; i <= times; i++) { // int i = 0; i < times; i++
            System.out.println(message);
        }
    }
}
