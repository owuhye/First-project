package munje_jihye;

public class Continue {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 5) {
            System.out.println("i =" + i);
            if (i == 3) {
                i++;    // i++를 안하면 계속 i=3이되서 무한 루프 돌게됨.. i++를 해서 4로 만들어주자
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
