package method;

public class Method2 {
    public static void main(String[] args) {
        printHeader();
//        String str = printHeader(); // void라 반환타입x , 반환한다 하면 오류
        System.out.println("프로그램이 동작합니다.");
        printFooter();
    }

    public static void printHeader(){
        System.out.println("= 프로그램을 시작합니다. =");
//        return; // void인 경우 생략 가능
    }


    public static void printFooter() {
        System.out.println("= 프로그램을 종료합니다. =");

    }
}
