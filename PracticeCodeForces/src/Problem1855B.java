import java.util.ArrayList;
import java.util.Scanner;

public class Problem1855B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            int count=0;
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    count++;
                }
                else{
                    break;
                }
            }
            System.out.println(count);
        }
    }
}
