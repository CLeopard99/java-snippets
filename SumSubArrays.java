package main;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SumSubArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];

        for(int i=0; i<n; i++) {
            array[i] = scan.nextInt();
        }
        scan.close();

        int negativeSums = 0;
        for(int j = 0; j < n; j++)  {
            int sum = 0;
                for(int k = j; k < n; k++) {
                   sum += array[k];
                   if(sum < 0) negativeSums++;
            }
        }
        System.out.println(negativeSums);
    }
}
