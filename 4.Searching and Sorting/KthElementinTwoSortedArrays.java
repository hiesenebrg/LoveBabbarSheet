public class KthElementinTwoSortedArrays {
    public long kthElement(int arr1[], int arr2[], int n, int m, int k) {
        int i = 0, j = 0, kth = 0;
        int temp = m;
        m = n;
        n = temp;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                kth += 1;
                if (kth == k)
                    return arr1[i];
                i += 1;
            } else {
                kth += 1;
                if (kth == k)
                    return arr2[j];
                j += 1;
            }
        }
        while (i < m) {
            kth += 1;
            if (kth == k)
                return arr1[i];
            i += 1;
        }
        while (j < n) {
            kth += 1;
            if (kth == k)
                return arr2[j];
            j += 1;

        }
        return -1;

    }
}
