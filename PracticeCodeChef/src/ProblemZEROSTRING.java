import java.util.Scanner;

public class ProblemZEROSTRING {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int count1=0;int count0=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='1') count1++;
                else count0++;
            }
            if(count1>count0) System.out.println(count0+1);
            else System.out.println(count1);
        }
    }
}
