package munje_jihye;

public class ForEx5 {

    public static void main(String[] args) {

        /*for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {      // j는 무조건 5부터 시작 i가 1, 2, 3, 4, 5로 올라가도 j는 다시 시작
                System.out.print("*");
            }
            System.out.println();
        }*/

    // 별찍기 빈칸 반대 - 성공!
      /*  for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("_");
            }
                for (int x = 1; x <= i; x++) {
                    System.out.print("*");
                }
            System.out.println();
        }*/

        //별찍기 빈칸 - 성공!
       /* for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int x = 4; x >= i; x--) {   // x 마지막 1이 i의 1과 비교했다
                System.out.print("_");
            }
            System.out.println();
        }*/

    }
}
