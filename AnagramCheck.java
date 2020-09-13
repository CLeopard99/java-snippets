package main;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {

    static boolean isAnagram(String a, String b) {
        String s1 = a.replaceAll("\\s", "");
        String s2 = b.replaceAll("\\s", "");
        if (s1.length() != s2.length()) {
            return false;
        } else {
            char charArray1[] = s1.toLowerCase().toCharArray();
            char charArray2[] = s2.toLowerCase().toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            if (Arrays.equals(charArray1,charArray2))
                return true;
            else
                return false;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean check = isAnagram(a, b);
        System.out.println((check) ? "Anagrams" : "Not Anagrams");
    }
}




