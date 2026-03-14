import java.util.Scanner;

public class Problem229C_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = b;
            n--;
            while(n-->0){
                a = sc.nextInt();
                b = sc.nextInt();
                if(x>b) x=b;
                else if(x<a) x=a;
            }
            System.out.println(x);
        }
    }
}
