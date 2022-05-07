public class question04 {
    /*
    Given an integer n, return any array containing n unique integers such that they add up to 0.
     */
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int i = 0, p = n - 1, q = 1;
        while (i < p) {
            arr[i++] = q;
            arr[p--] = -q;
            q++;
        }
        if (i == p) arr[i] = 0;
        return arr;
    }
}




