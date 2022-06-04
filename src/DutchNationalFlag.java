public class DutchNationalFlag {

    public static void main(String args[]) {

        int[] A = {2,2,0,1};

        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;
        for(int i = 0;i<A.length;i++){
            if(A[i]==0)
                zeroCount++;
            else if(A[i]==1)
                oneCount++;
            else
                twoCount++;
        }

        System.out.println("Zero "+zeroCount+"One "+oneCount+"Two "+twoCount);
        int j = 0;
        while(zeroCount-- > 0){
            System.out.println("J  Zero"+j);
            A[j++] = 0;
        }

        while(oneCount-- > 0){
            System.out.println("J One"+j);
            A[j++] = 1;
        }

        while(twoCount-- > 0){
            System.out.println("J Two"+j);
            A[j++] = 2;
        }

        System.out.println(A[0] + " "+A[1] + " "+A[2]+" "+A[3]);
    }
}
