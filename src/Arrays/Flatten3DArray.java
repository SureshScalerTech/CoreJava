package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Flatten3DArray {
    public static void main(String[] args) {
        int[][][] cube = {
                {{1, 2}, {3, 4}},
                {{5, 6}, {7, 8}}
        };
        List<Integer> flatList = new ArrayList<>();
        for (int[][] matrix : cube) {
            for (int[] row : matrix) {
                for (int val : row) {
                    flatList.add(val);
                }
            }
        }
        System.out.println("Flattened Array: " + flatList);
    }
}
