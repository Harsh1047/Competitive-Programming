import java.util.Scanner;

public class Problem546A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int total=0;
        for(int i=1;i<=w;i++){
            total+=i*k;
        }
        if(total<=n) System.out.println(0);
        else System.out.println(total-n);
    }
}
