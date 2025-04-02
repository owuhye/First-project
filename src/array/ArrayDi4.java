package array;

public class ArrayDi4 {

    public static void main(String[] args) {
        // 2x3 2차원 배열을 만든다.
        int[][] arr = new int[3][3];   //행3, 열3

        int i = 1;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {

                arr[row][col] = i++;
//                arr[0][0] = 1;
//                arr[0][1] = 2;
//                arr[0][2] = 3;
//                arr[1][0] = 4;
//                arr[1][1] = 5;
//                arr[1][2] = 6;
//                arr[2][0] = 7;
//                arr[2][1] = 8;
//                arr[2][2] = 9;
                //이 값은 여기 for문 안에서만 사용 가능한 거 아닌가?
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {   // arr[row]의 의미: 첫 번째 행의 길이가 3개 라는 의미
                System.out.print(arr[row][col] + " ");  //0열 출력
            }
            System.out.println();
        }
    }
}
