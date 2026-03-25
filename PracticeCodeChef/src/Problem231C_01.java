import java.util.Scanner;

public class Problem231C_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            if(n%10==0) System.out.println(2);
            else if(n%2==0 || n%5==0) System.out.println(0);
            else if(n%2!=0) System.out.println(1);
        }
    }
}
