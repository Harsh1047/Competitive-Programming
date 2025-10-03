import java.util.Scanner;

public class Problem2148A {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        while(k-->0){
            int x = sc.nextInt();
            int n = sc.nextInt();
            if(n%2 == 0){
                count = 0;
            }
            else{
                count = x;
            }
            System.out.println(count);
        }

    }
}
