import java.util.Scanner;

public class Problem2266C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int count0=0;
            int count1=0;
            if(s.charAt(0)==1){
                for(int i=1;i<n;i++){
                    if(s.charAt(i)=='0') count0++;
                }
                System.out.println(count0);
            }
            else{
                for(int i=0;i<n;i++){
                    if(s.charAt(i)=='1') count1++;
                    if(s.charAt(i)=='0') count0++;
                }
                System.out.println(Math.min(count0,count1));
            }
        }
    }
}
