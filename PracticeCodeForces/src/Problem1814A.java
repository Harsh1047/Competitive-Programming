import java.util.Scanner;

public class Problem1814A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            if(n%2==0){
                System.out.println("Yes");
            }
            else if(n%2!=0 && k%2!=0 && k<=n){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
