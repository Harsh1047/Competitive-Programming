import java.util.Scanner;

public class Problem2180A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int l = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(l%b==0) System.out.println(l/b);
        }
    }
}
