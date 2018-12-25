package strings;

import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()) {
            return false;
        }

        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();

        for (int i=0; i<a.length(); i++) {
            char aChar = a.charAt(i);
            int aCharCounter = 0;
            int bCharCounter = 0;
            for (int j=0; j<a.length(); j++) {
                if (aChar == a.charAt(j)){
                    aCharCounter++;
                }
            }
            for (int k=0; k<a.length(); k++) {
                if(aChar == b.charAt(k)) {
                    bCharCounter++;
                }
            }
            if (aCharCounter == bCharCounter){
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

