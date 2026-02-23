import java.util.Scanner;

public class ProblemMAX_BIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            StringBuilder sb = new StringBuilder(s);
            while(k-->0){
                if(sb.charAt(0)=='0') sb.replace(0,1, "1");
                else sb.append("0");
            }
            System.out.println(sb.toString());
        }
    }
}
