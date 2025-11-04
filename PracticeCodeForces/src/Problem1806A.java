import java.util.Scanner;

public class Problem1806A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            boolean istrue = false;
            int count=0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            if(b>d){
                System.out.println(-1);
            }
            else{
                count = d-b;
                a+=count;
                count += (a-c);
                if(c>a){
                    System.out.println(-1);
                }
                else{
                    System.out.println(count);
                }
            }

        }
    }
}
