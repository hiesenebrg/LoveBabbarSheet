public class AssemblyLineScheduling {
    public static int asemblyLineScheduling(int[][] a , int[][] t , int[] start , int[] end) {
        int[] t1 = new int[a[0].length];
        int[] t2 = new int[a[0].length];
        t1[0] = start[0] +t[0][0];
        t2[0] = start[1] + t[1][0];
        for (int i = 1; i < a[0].length; i++) {
            t1[i] = Math.min(t1[i-1] + a[0][i], t2[i-1]+t[1][i] +a[0][i] );
            t2[i] = Math.min(t2[i-1] + a[1][i], t1[i-1]+t[0][i] +a[1][i] );
        }
        return Math.min(t1[a[0].length-1] + end[0] , t2[a[0].length-1]+end[1]);

    }
    public static void main(String[] args) {
        int a[][] = {{4, 5, 3, 2},
                    {2, 10, 1, 4}};
        int t[][] = {{0, 7, 4, 5},
                    {0, 9, 2, 8}};
        int e[] = {10, 12}, x[] = {18, 7};
      
        System.out.println(asemblyLineScheduling(a, t, e, x));
    }
}
