package array;

public class ArrayDi2 {

    public static void main(String[] args) {
        // 2x3 2차원 배열을 만든다.
        int[][] arr = new int[2][3];    //행2, 열3

        arr[0][0] = 1; //0행, 0열
        arr[0][1] = 2; //0행, 1열
        arr[0][2] = 3; //0행, 2열
        arr[1][0] = 4; //1행, 0열
        arr[1][1] = 5; //1행, 1열
        arr[1][2] = 6; //1행, 2열

        //내가 한 for문
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print( i + " " + j + " ");
//                System.out.println();
//            }
//        }

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(arr[row][col] + " ");  //0열 출력
//                System.out.print(arr[row][col] + " ");  //1열 출력
//                System.out.print(arr[row][col] + " ");  //2열 출력
//                System.out.println();
            }
            System.out.println();
        }
    }
}
