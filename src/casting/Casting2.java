package casting;

public class Casting2 {

    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

//        intValue = doubleValue; //컴파일 오류 발생
        intValue = (int)doubleValue;    //형변환 ( double을 int로 변경 )
        System.out.println(intValue); // 1



        System.out.println(10.5);   //10.5
        System.out.println((int)10.5); // 10

        int z = (int)10.5;
        System.out.println(z); // 10

        System.out.println("doubleValue = " + doubleValue);
    }
}
