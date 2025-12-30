import java.util.Scanner;

public class ProblemENCMSG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            StringBuilder sb = new StringBuilder(s);
            for(int i=1;i<n;i+=2){
                char temp = sb.charAt(i);
                sb.replace(i,i+1, String.valueOf(sb.charAt(i-1)));
                sb.replace(i-1,i, String.valueOf(temp));
//                System.out.println(sb);
//                sb.replace(i,i+1, String.valueOf(Math.abs('z'-sb.charAt(i))));
//                sb.replace(i-1,i, String.valueOf(Math.abs('z'-sb.charAt(i-1))));
            }
            for(int i=0;i<n;i++){
                if(sb.charAt(i)<='o') sb.replace(i,i+1, String.valueOf('z'-i));
                else sb.replace(i,i+1, String.valueOf(Math.abs(i - 'z')));
            }
            System.out.println(sb);
        }
    }
}
