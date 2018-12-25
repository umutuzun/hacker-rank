package strings;

import java.io.*;
import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        int tokenCount = 0;
        String[] tokens = s.split("[ !,?._'@]");
        for(int i=0; i<tokens.length; i++){
            if(!tokens[i].equalsIgnoreCase("")){
                tokenCount++;
            }
        }
        System.out.println(tokenCount);
        for(int i=0; i<tokens.length; i++){
            if(!tokens[i].equalsIgnoreCase("")){
                System.out.println(tokens[i]);
            }
        }
        scan.close();
    }
}
