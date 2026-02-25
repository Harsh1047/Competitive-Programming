import java.util.Scanner;

public class Problem226D_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int m = sc.nextInt();
            int k=x-(y*m);
            if(k>0) System.out.println(k);
            else System.out.println(0);
        }
    }
}
