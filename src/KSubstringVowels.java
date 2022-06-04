public class KSubstringVowels {

    public static void main(String args[]) {
        String s = "substring";
        int k = 2;
            int len = s.length();
            int[] arr = new int[len - k + 1];

            int count = 0;
            for(int i=0;i<k;i++){
                if(isVowel(s.charAt(i)))
                    count++;
            }

            int j =0;
            arr[j]= count;

            for(int i = k;i<len;i++){
                System.out.println("i "+ i + " count "+count);
                if(isVowel(s.charAt(i))) {
                    System.out.println(" to be includeded " + s.charAt(i));
                    count++;
                    System.out.println("count after including "+ count);
                }
                System.out.println(" j " + j);
                if(isVowel(s.charAt(j++))) {
                    System.out.println(" to be removed " + s.charAt(j-1));
                    count--;
                System.out.println("count after removing "+ count);}

                arr[j] = count;
                System.out.println("j "+j+" arr[j] "+ arr[j]);
            }

           System.out.println(arr[0]);
            System.out.println(arr[1]);
            System.out.println(arr[2]);
            System.out.println(arr[3]);
            System.out.println(arr[4]);System.out.println(arr[5]);System.out.println(arr[6]);System.out.println(arr[7]);
        }

        static boolean isVowel(Character c) {
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            return true;
        return false;
    }
}
