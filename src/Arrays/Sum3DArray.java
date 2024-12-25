package Arrays;

public class Sum3DArray {
    public static void main(String[] args) {
        int[][][] cube = {
                {{1, 2}, {3, 4}},
                {{5, 6}, {7, 8}}
        };
        int sum = 0;
        for (int[][] matrix : cube) {
            for (int[] row : matrix) {
                for (int val : row) {
                    sum += val;
                }
            }
        }
        System.out.println("Sum of all elements = " + sum);
    }
}
