import java.util.Scanner;

public class Problem1433A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            int n = ((s.charAt(0)-'1')*10);
            n += (s.length()*(s.length()+1))/2;
            System.out.println(n);

        }
    }
}
