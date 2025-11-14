import java.util.Scanner;

public class Problem1475A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            int val = (int) (Math.log(n)/Math.log(2));
            boolean isok = false;
            if(n%2!=0){
                isok = true;
            }
            else if(!isok){
                if((n/2)%2==0){
                    isok = false;
                }
                else{
                    isok = true;
                }
            }
            if(isok){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
