import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class ProblemP2BAR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            boolean isok = false;
            int p=0;
            int count=0;
            int n = sc.nextInt();
            String str = sc.next();
            for(int i=0;i<n;i++){
                if(str.charAt(i)=='0'){
                    isok = true;
                    p=i;
                    break;
                }
            }
            for(int i=p;i<n;i++){
                if(str.charAt(i)=='1'){
                    count++;
                }
            }
            if(isok){
                System.out.println(count);
            }
            else{
                System.out.println(0);
            }
        }
    }
}
