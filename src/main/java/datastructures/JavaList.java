package datastructures;

import java.io.*;
import java.util.*;

public class JavaList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        ArrayList list = new ArrayList();
        for (int i=0; i<n; i++) {
            list.add(i, scanner.nextInt());
        }

        int q = scanner.nextInt();
        for ( int i=0; i<q; i++) {
            if (scanner.next().toLowerCase().equalsIgnoreCase("insert")){
                list.add(scanner.nextInt(), scanner.nextInt());
            }
            else {
                list.remove(scanner.nextInt());
            }
        }
        scanner.close();
        for (int i=0; i<list.size(); i++) {
            System.out.print(list.get(i)+ " ");
        }
    }
}