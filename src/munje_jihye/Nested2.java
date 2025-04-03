package munje_jihye;

public class Nested2 {

    public static void main(String[] args) {


        //for문
        for (int num = 2, count = 1; count <= 10; num += 2, count++){
                System.out.println(num);
            }

        //while문
        int num = 2;
        int count2 = 1;

        while (count2 <= 10){
            System.out.println(num);
            num += 2;
            count2++;
        }
    }
}
