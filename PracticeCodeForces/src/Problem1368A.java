import java.util.Scanner;

public class Problem1368A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
//            if(a>b){
//                int k=0;
//                while(a<=n && b<=n){
//                    a+=b;
//                    b+=a;
//                    k+=2;
//                    System.out.println(a +" "+b);
//                }
//                System.out.println(k);
//            }
//            else {
//                int k=0;
//                while(b<=n && a<=n){
//                    b+=a;
//                    a+=b;
//                    k+=2;
//                    System.out.println(a +" "+b);
//                }
//                System.out.println(k);
//            }
            int k=0;
            while(a<=n && b<=n){
                if(a<=n) {
                    a+=b;
                    k++;
                }
                if(b<=n){
                    b+=a;
                    k++;
                }
                if(a>=n || b>=n) break;
            }
            System.out.println(k);
        }

    }
}
