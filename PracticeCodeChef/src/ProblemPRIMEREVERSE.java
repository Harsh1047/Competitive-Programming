import java.util.Scanner;

public class ProblemPRIMEREVERSE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int c1a = 0,c1b = 0,c0a = 0,c0b = 0;
            String a = sc.next();
            String b = sc.next();
            for(int i=0;i<n;i++){
                if(a.charAt(i)=='1') c1a++;
                else c0a++;
                if(b.charAt(i)=='1') c1b++;
                else c0b++;
            }
            if(c1a==c1b && c0a==c0b) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
