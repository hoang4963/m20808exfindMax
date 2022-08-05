public class findMax {
    public static void main(String[] args) {
        int arr[][] = {{1, 2}, {3, 4}, {5, 6}};
        System.out.print(fM(arr));
    }
    public static int fM(int[][] arr){
        int max;
        max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
