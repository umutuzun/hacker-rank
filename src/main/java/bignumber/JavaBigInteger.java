package bignumber;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class JavaBigInteger {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        BigInteger int1 = input.nextBigInteger();
        BigInteger int2 = input.nextBigInteger();

        System.out.println(int1.add(int2));
        System.out.println(int1.multiply(int2));
    }
}