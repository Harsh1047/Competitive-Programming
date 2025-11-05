import java.util.ArrayList;
import java.util.Scanner;

public class Problem1791C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int count=0;
            int n = sc.nextInt();
            String str = sc.next();
            StringBuilder sb = new StringBuilder(str);
            for(int i=0;i<n/2;i++){
                if((sb.charAt(i)=='1' && sb.charAt(n-i-1)=='0') || (sb.charAt(i)=='0' && sb.charAt(n-i-1)=='1')){
                    count+=2;
                }
                else{
                    break;
                }
            }
            System.out.println(sb.length()-count);
        }

    }
}
