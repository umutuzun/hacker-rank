package strings;

import java.io.*;
import java.util.*;

public class StringReverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        for (int i = 1; i<A.length()/2; i++) {
            Character character1 = A.charAt(A.length()-i);
            Character character2 = A.charAt(i-1);
            if (character1 == character2){
                continue;
            }
            else{
                System.out.println("No");
                System.exit(0);
            }
        }
        System.out.println("Yes");

    }
}