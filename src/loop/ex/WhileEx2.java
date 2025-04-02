package loop.ex;

public class WhileEx2 {

    public static void main(String[] args) {

        int num = 2;
        int count = 1;

        while (count <= 10) {       // count로는 반복 받고, num은 2더하고
            System.out.println(num);
            num += 2;
//            System.out.println(num);
            count++;
//            System.out.println(count);
        }
    }



}
