import java.util.Scanner;

public class Problem116A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int k = sc.nextInt();
        int l = sc.nextInt();
        int t = l-k;
        max = Math.max(t,max);
        for(int i=0;i<n-1;i++){
            k = sc.nextInt();
            l = sc.nextInt();
            t+=l-k;
            max = Math.max(t,max);
        }
        System.out.println(max);
    }
}
