import java.util.Scanner;

public class ProblemWOLFDOWN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            boolean one = false;
            int count=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='0' && !one) count++;
                else if(s.charAt(i)=='1' && !one) one = true;
                else break;
            }
            System.out.println(count);
        }
    }
}
