package array;

public class ArrayDi3 {

    public static void main(String[] args) {
        // 2x3 2차원 배열을 만든다.
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
        };    //행2, 열3

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {   // arr[row]의 의미: 첫 번째 행의 길이가 3개 라는 의미
                System.out.print(arr[row][col] + " ");  //0열 출력
            }
            System.out.println();
        }
    }
}
