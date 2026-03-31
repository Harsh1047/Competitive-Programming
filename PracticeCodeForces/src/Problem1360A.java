import java.util.Scanner;

public class Problem1360A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(Math.max(a,b)<Math.min(a,b)*2) System.out.println(4*Math.min(a,b)*Math.min(a,b));
            else System.out.println(Math.max(a,b)*Math.max(a,b));
        }
    }
}
