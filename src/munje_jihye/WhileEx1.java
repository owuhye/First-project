package munje_jihye;

public class WhileEx1 {

    public static void main(String[] args) {
//         int count = 0;
//
//        while (count < 3) {
//            count++;
//            System.out.println("현재 숫자는 : " + count);
//        }


//        int sum = 0;
//
//        sum = sum + 1; // 0 + 1
//        sum = sum + 2; // 1 + 2
//        sum = sum + 3; // 2 + 3
//        System.out.println(sum);

//        int sum = 0;
//        int i = 1;
//        sum = sum + i; // 0 + 1
//        System.out.println(i); // 1
//        i++; // 2
//
//        sum = sum + i; // 2
//        System.out.println(i); // 2
//        i++; // 3
//
//        System.out.println(i); // 3
//        sum = sum + i;  //0 + 3
//        System.out.println(i); // 3


        int sum = 0;
        int i = 1;
        int endNum = 3;

        while ( i <= endNum){
            sum = sum + i;
            System.out.println(" i= " + i + " sum = " + sum);
            i++;
        }

    }
}
