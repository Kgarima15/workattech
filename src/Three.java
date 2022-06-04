import java.util.Arrays;
import java.util.Scanner;

public class Three {

    public static void main(String args[] ) throws Exception {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int g = sc.nextInt();

            int arr[] = new int[g];
            for (int i=0;i<g;i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);

            long minAmount = 0;
            for(int i =0;i<n;i++){
                minAmount = minAmount+arr[i];
            }
            System.out.println(minAmount);
        }

    }
}
