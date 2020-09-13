package main;

import java.util.*;

public class ArrayListXYSearch {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<ArrayList<Integer>> rows = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int r = scan.nextInt();
            ArrayList<Integer> row = new ArrayList<>();

            for (int j = 0; j < r; j++) {
                row.add(scan.nextInt());
            }
            rows.add(row);
        }

        int q = scan.nextInt();
        for (int k = 0; k < q; k++) {
            int x = scan.nextInt();
            int y = scan.nextInt();

            try {
                System.out.println(rows.get(x - 1).get(y - 1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
    }
}
