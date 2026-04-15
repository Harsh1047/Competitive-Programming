import java.util.Scanner;

public class Problem234C_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int x=0;
            if(n==2) System.out.println(10);
            else if(n==1) System.out.println(0);
            else {
                System.out.print(1);
                for (int i = 1; i <= n - 2; i++) System.out.print(0);
                System.out.println(1);
            }
//            for(int i=0;i<n;i++){
//                System.out.print(++x);
//                i++;
//                if(i<n) System.out.print(--x);
//                else break;
//            }
//            System.out.println();
        }
    }
}
