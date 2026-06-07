import java.util.Scanner;

public class Problem236C_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            String s = sc.next();
            int max=0;
            int count=0;
            for(int i=0;i<n-1;i++){
                if((s.charAt(i)=='u' || s.charAt(i)=='o') && s.charAt(i+1)=='w') {
                    count+=2;i++;
                }
                else {
                    max = Math.max(max, count);
                    count=0;
                }
                max = Math.max(max, count);
            }
            if((s.charAt(n-2)=='u'||s.charAt(n-2)=='o' && s.charAt(n-1)=='w') ||
                    (s.charAt(n-1)=='u'||s.charAt(n-1)=='o' && s.charAt(n-2)=='w')) max++;
            System.out.println(max);
        }
    }
}
