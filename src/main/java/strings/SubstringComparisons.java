package strings;

import java.util.Scanner;

public class SubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        int stringLength = s.length();
        int wordCount = stringLength - k + 1;
        String[] wordArray = new String[wordCount];
        for(int i=0; i<stringLength+1-k; i++){
            String word = s.substring(i,i+k);
            wordArray[i] = word;
        }
        smallest = wordArray[0];
        largest = wordArray[0];
        for ( int i = 1; i < wordArray.length; i++) {
            if (wordArray[i].compareTo(smallest) < 0) {
                smallest = wordArray[i];
            }
            if (wordArray[i].compareTo(largest) > 0) {
                largest = wordArray[i];
            }
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
