import java.util.Scanner;

public class ProblemXYSTR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int count = 0;
            for (int i = 0; i < s.length() - 1; i++) {
                if ((s.charAt(i) == 'x' && s.charAt(i + 1) == 'y') ||
                        (s.charAt(i) == 'y' && s.charAt(i + 1) == 'x')) {
                    count++;
                    i++;
                }
            }
            System.out.println(count);
        }
    }
}