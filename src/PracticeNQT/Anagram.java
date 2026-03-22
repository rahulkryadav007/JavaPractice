package PracticeNQT;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String s1 = "listen"; 
        String s2 = "silent";

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a, b)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}