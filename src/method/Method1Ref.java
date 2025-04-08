package method;

public class Method1Ref {

    public static void main(String[] args) {
        //계산1
        int sum1 = add(5, 10);
        System.out.println("결과 1 출력: " + sum1);

        System.out.println("==============================");

        //게산2
        int sum2 = add(15, 20);
        System.out.println("결과2 출력 : "+ sum2);

        add(100, 200);  //반환값 안써도됨 , 호출만해도 가능
    }

    //add메서드
    public static int add(int a, int b ) {  // int add의 int는 어떤 형을 반환하느냐. return값이 int인지
        System.out.println(a + "+" + b + " 연산 수행을 시작합니다. ");
        int sum = a + b + 1000;
        return sum;
    }

}
