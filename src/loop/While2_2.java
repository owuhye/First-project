package loop;

public class While2_2 {

    public static void main(String[] args) {
        int sum = 0 ;
        int i = 1;  // 1부터 더(+) 할거다 /  int i = 10; → 10부터 더(+) 할거다.

        sum = sum + i;
        System.out.println("i = " + i + "," + " sum = " + sum);
        i++; // 2
        System.out.println(i);

        sum = sum + i; // 1 + 2
        System.out.println("i = " + i + "," + " sum = " + sum);
        i++; // 3
        System.out.println(i);

        sum = sum + i;  // 3 + 3
        System.out.println("i = " + i + "," + " sum = " + sum);
    }
}
