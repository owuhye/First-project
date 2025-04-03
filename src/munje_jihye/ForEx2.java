package munje_jihye;

public class ForEx2 {

    public static void main(String[] args) {

        int sum = 0;
        int  max= 100;

        //for문
//        for (int num = 1; num <= max; num++) {
//            sum += num;
//        }
//        System.out.println(sum);

         //while
        int i = 1;
        while (i <= max) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
