public class BinarySearch {

    public static void main(String args[]) {
        int[] arr = {1,3,5,7,10,13,15};
        int k = 1;

        System.out.println(binarySearch(arr,0, arr.length-1, k));

    }

    private static int binarySearch(int[] arr, int l, int r, int x) {


        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            return binarySearch(arr, mid + 1, r, x);
        }

        return -1;
    }
}
