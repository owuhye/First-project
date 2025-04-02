package array;

public class Array1Ref4 {

    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50, 40, 30};  // 배열 생성과 초기화

        //변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]); // (i + 1) 의미 : 배열은 0이니까 1을 더해줌
                                    // i + 1 (괄호x 안하고 이렇게 사용하면, ' 01, 11, ... ' 이렇게 나옴. 문자+숫자는 '문자'

        }

    }
}
