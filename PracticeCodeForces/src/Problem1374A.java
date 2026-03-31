import java.util.Scanner;

public class Problem1374A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int n = sc.nextInt();
            int q = 0;
            for(int i=0;i<x;i++){
                if((n-i)%x==y) {
                    q=i;
                    break;
                }
            }
            n-=q;
            System.out.println(n);
        }
    }
}
