public class LongestRecurringSubsequence {
    public int  longestRecurringSubsequence(String str)
    {
        String s1 = str , s2 = str;
        int x =s1.length() , y = s1.length();
        int L[][] = new int[x + 1][y + 1];

        /*
         * Following steps build L[m+1][n+1] in bottom up fashion. Note
         * that L[i][j] contains length of LCS of X[0..i-1] and Y[0..j-1]
         */

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {

                if (s1.charAt(i - 1) == s2.charAt(j - 1) && i!=j)
                    L[i][j] = L[i - 1][j - 1] + 1;
                else
                    L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]);
            }
        }
        return L[x][y];
    }
}
