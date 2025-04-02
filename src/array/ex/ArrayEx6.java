package array.ex;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("입력 받을 숫자의 개수를 입력하세요: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        int minNumber, maxNumber;

        System.out.println(n + "개의 정수를 입력하세요.:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

//        minNumber = numbers[0]; //초기화   // minNumber = maxNumber = numbers[0]; 은 잘 사용x => number[0]값이 maxNumber에 들어가면, minNumber = maxNumber 이렇게 됨
//        maxNumberNumber = numbers[0]; //초기화
        minNumber = maxNumber = numbers[0];
        for (int i = 0; i < n; i++) {
            if(numbers[i] < minNumber){
                minNumber = numbers[i];
            }
            if(numbers[i] > maxNumber){
                maxNumber = numbers[i];
            }
        }
        System.out.println("가장 작은 수: " + minNumber);
        System.out.println("가장 큰 수: " + maxNumber);
    }
}

