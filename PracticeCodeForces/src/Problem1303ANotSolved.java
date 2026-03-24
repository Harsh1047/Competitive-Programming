import java.util.Scanner;

public class Problem1303ANotSolved {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            boolean start = false;
            boolean waszero = false;
            int count=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='1' && waszero) start = true;
                else if(s.charAt(i)=='0'){
                    if(start) count++;
                    waszero = true;
                }
            }
            System.out.println(count);
        }
    }
}
