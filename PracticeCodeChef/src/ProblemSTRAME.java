import java.util.Scanner;

public class ProblemSTRAME {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int one=0;int zero=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='1') one++;
                else zero++;
            }
            int k = Math.min(one,zero);
            if(k%2==1) System.out.println("Zlatan");
            else System.out.println("Ramos");
        }
    }
}
