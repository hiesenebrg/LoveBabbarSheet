import java.util.Arrays;

public class MAximumLengthofPAirChain {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[1] - b[1];
            }
        });

        int i = 0;
        int j = 1, ans = 1;
        while (j < pairs.length) {
            if (pairs[i][1] < pairs[j][0]) {
                ans++;
                i = j;
                j++;
            } else
                j++;
        }
        return ans;
    }
}
