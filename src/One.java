import java.util.Arrays;
import java.util.HashSet;

public class One {

    public static void main(String args[]) {
        System.out.println("hello world");

        String s = "substring";
        int k = 2;


        HashSet<Character> hs = new HashSet<Character>(Arrays.asList('a','e','i','o','u'));

        int count = 0;
        int i ;
        for(i = 0;i<k;i++){
            if(hs.contains(s.charAt(i))){
                count++;
            }
        }

        int j;
        i = 0;
        int maxCountSoFar = count;
        boolean firstVowel;
        boolean lastVowel;
        for(j=k; j<s.length(); j++) {
            firstVowel = hs.contains(s.charAt(i++));
            lastVowel = hs.contains(s.charAt(j));

            if(firstVowel){
                count--;
            }

            if(lastVowel)
                count++;

            if(count > maxCountSoFar) {
                maxCountSoFar = count;
            }

        }

        System.out.println(maxCountSoFar);
    }
}
