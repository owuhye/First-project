package loop.ex;

public class EnhancedFor1 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};


        //일반 for문
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        //향상된 for문, for-each문
        for (int number : numbers) { // 배열인 numbers에서 순서대로 하나씩 꺼내서 number에 넣는다.
            System.out.println(number);
        }

        //iter : 향상된 for문 단축키
        for (int number : numbers) {
            System.out.println(number);
        }

        //for-each문을 사용할 수 없는경우, 증가하는 index 값 필요
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("nubmer" + i + "번의 결과는: " + numbers[i]);
        }
    }
}
