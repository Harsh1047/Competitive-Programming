import java.util.*;

public class ProblemUPPATH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] row1 = new long[n];
            long[] row2 = new long[n];

            for (int i = 0; i < n; i++) row1[i] = sc.nextLong();
            for (int i = 0; i < n; i++) row2[i] = sc.nextLong();

            // minTop[i] stores the smallest possible value at (1, i)
            // reached by a non-decreasing path from (1, 1)
            long[] minTop = new long[n];
            long v1 = Math.min(row1[0], row2[0]);
            long v2 = Math.max(row1[0], row2[0]);
            minTop[0] = v1;

            for (int i = 1; i < n; i++) {
                long low = Math.min(row1[i], row2[i]);
                long high = Math.max(row1[i], row2[i]);

                // We want the smallest value that is >= previous minTop
                if (low >= minTop[i-1]) {
                    minTop[i] = low;
                } else if (high >= minTop[i-1]) {
                    minTop[i] = high;
                } else {
                    minTop[i] = Long.MAX_VALUE; // Path broken
                }
            }

            // maxBottom[i] stores the largest possible value at (2, i)
            // that can reach (2, n) with a non-decreasing path
            long[] maxBottom = new long[n];
            v1 = Math.min(row1[n-1], row2[n-1]);
            v2 = Math.max(row1[n-1], row2[n-1]);
            maxBottom[n-1] = v2;

            for (int i = n - 2; i >= 0; i--) {
                long low = Math.min(row1[i], row2[i]);
                long high = Math.max(row1[i], row2[i]);

                // We want the largest value that is <= next maxBottom
                if (high <= maxBottom[i+1]) {
                    maxBottom[i] = high;
                } else if (low <= maxBottom[i+1]) {
                    maxBottom[i] = low;
                } else {
                    maxBottom[i] = Long.MIN_VALUE; // Path broken
                }
            }

            // Final Check: Can we drop at any column i?
            boolean possible = false;
            for (int i = 0; i < n; i++) {
                if (minTop[i] != Long.MAX_VALUE && maxBottom[i] != Long.MIN_VALUE) {
                    if (minTop[i] <= maxBottom[i]) {
                        possible = true;
                        break;
                    }
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }
        sc.close();
    }
}