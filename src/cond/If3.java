package cond;

public class If3 {
    public static void main(String[] args) {
        int age = 19;

        if ( age <= 7 ){
            System.out.println("미취학");
        } else if ( 8 <= age && age <= 13) {
            System.out.println("초등학생");
        } else if ( 14 <= age && age <= 16) {
            System.out.println("중학생");
        } else if ( 17 <= age && age <= 19) {
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }

    }
}
