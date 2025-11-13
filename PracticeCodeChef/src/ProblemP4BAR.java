import java.util.Scanner;

public class ProblemP4BAR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int cnt00 = 0;
            int cnt11 = 0;
            String str = sc.next();
            for(int i=1;i<n;i++){
                if(str.charAt(i-1)=='1' && str.charAt(i)=='1'){
                    cnt11++;
                }
                else if(str.charAt(i-1)=='0' && str.charAt(i)=='0'){
                    cnt00++;
                }
            }
            if(cnt11>=cnt00){
                System.out.println(0);
            }
            else{
                System.out.println((cnt00-cnt11+1)/2);
            }
        }
    }
}
