import java.util.Scanner;

public class Problem1426A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            float n = sc.nextInt();
            float x = sc.nextInt();
            int total=1;

            if(n==1) System.out.println(1);
            else {
                n-=2;
                if(n/x>(int)(n/x)) System.out.println(total+(int)(n/x)+1); // Math.ceil(n/x)
                else System.out.println(total+(int)(n/x));
            }
        }
    }
}
