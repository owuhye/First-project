package array;

public class Array1Ref2 {

    public static void main(String[] args) {
        int[] students;  //배열 변수 선언
        students = new int[5];  // 배열 생성 ( 배열을 5개 생성해서 students에 대입 )

        System.out.println(students.length);    //하기 전에 한번 길이 출력해보기

        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        //변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]); // (i + 1) 의미 : 배열은 0이니까 1을 더해줌
                                    // i + 1 (괄호x 안하고 이렇게 사용하면, ' 01, 11, ... ' 이렇게 나옴. 문자+숫자는 '문자'

        }

    }
}
