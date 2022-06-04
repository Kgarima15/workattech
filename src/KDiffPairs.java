public class KDiffPairs {

    public static void main(String args[]) {

        int[] A = {1,3,5,7,10};
        int count = 0;
        int k = 1;

        for (int i = 0; i < A.length; i++) {
            System.out.println(" i "+i);
            if (binarySearch(A, i + 1, A.length - 1, k + A[i])){
                System.out.println(" count "+ count);
                count++;
            }

        }

        System.out.println(count);

    }
    private static boolean binarySearch(int[] arr, int l, int r, int x) {


        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x)
                return true;

            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            return binarySearch(arr, mid + 1, r, x);
        }

        return false;
    }

}
