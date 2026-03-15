import java.util.Scanner;

public class ProblemMINMXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int tx = 0;
            for(int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
                tx ^= arr[i];
            }
            int xor = Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                int xorwithoutarri = tx^arr[i]; // ek hi element se dobara xor karne par vo element de-xor ho jata hai...ex 0^1^7 = 6 but 0^1^7^7 = 0^1 = 1;
                xor = Math.min(xor, xorwithoutarri);
            }
            System.out.println(Math.min(tx,xor));

        }
    }
}
