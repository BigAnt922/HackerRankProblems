package hackerrank;

import java.util.Scanner;

public class StrangeCounter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        in.close();
        long n = 2;
        while (3 * (n - 1) < t){
            n = 2 * n;
        }
        System.out.println((3 * (n - 1) - t + 1));

    }
}
