import java.util.ArrayList;
import java.util.HashMap;

public class LargestAreaRectangleSubMatrixwithequal0sand1s {
    static boolean subArrWithSumZero(int arr[], int start, int end, int n) {
        // to store cumulative sum
        int sum[] = new int[n];

        // map to store the indexes of sum
        HashMap<Integer, Integer> um = new HashMap<Integer, Integer>();

        // build up the cumulative sum[] array
        sum[0] = arr[0];
        for (int i = 1; i < n; i++)
            sum[i] = sum[i - 1] + arr[i];

        // to store the maximum length subarray
        // with sum equal to 0
        int maxLen = 0;

        // traverse to the sum[] array
        for (int i = 0; i < n; i++) {
            // if true, then there is a subarray
            // with sum equal to 0 from the
            // beginning up to index 'i'
            if (sum[i] == 0) {
                // update the required variables
                start = 0;
                end = i;
                maxLen = (i + 1);
            }

            // else if true, then sum[i] has not
            // seen before in 'um'
            else if (um.get(sum[i]) == null)
                um.put(sum[i], i);

            // sum[i] has been seen before in the
            // unordered_map 'um'
            else {
                // if previous subarray length is smaller
                // than the current subarray length, then
                // update the required variables
                if (maxLen < (i - um.get(sum[i]))) {
                    maxLen = i - um.get(sum[i]);
                    start = i - um.get(sum[i]) + 1;
                    end = i;
                }
            }
        }

        // if true, then there is no
        // subarray with sum equal to 0
        if (maxLen == 0)
            return false;

        // else return true
        return true;
    }

    public static ArrayList<ArrayList<Integer>> sumZeroMatrix(int[][] a) {
        int row = a.length;
        int col = a[0].length;
        int temp[] = new int[row];
        int startRow = 0, endRow = 0;

        int finalLeft = -1, finalRight = -1, finalTop = -1,
                finalBottom = -1;
        int maxArea = 0;

        // Set the left column
        for (int left = 0; left < col; left++) {

            for (int right = left; right < col; right++) {

                for (int i = 0; i < row; i++)
                    temp[i] += a[i][right];

                if (subArrWithSumZero(temp, startRow,
                        endRow, row)) {
                    int area = (right - left + 1)
                            * (endRow - startRow + 1);

                    if (maxArea < area) {
                        finalTop = startRow;
                        finalBottom = endRow;
                        finalLeft = left;
                        finalRight = right;
                        maxArea = area;
                    }
                }
            }
        }

        ArrayList<Integer> small_ans = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = finalTop; i < finalBottom; i++) {
            for (int j = finalLeft; i < finalRight; i++) {
                small_ans.add(a[i][j]);
            }
            ans.add(small_ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        int mat[][] = { { 0, 0, 1, 1 },
                { 0, 1, 1, 0 },
                { 1, 1, 1, 0 },
                { 1, 0, 0, 1 } };
        int row = 4, col = 4;
        sumZeroMatrix(mat, row, col);
    }
}
