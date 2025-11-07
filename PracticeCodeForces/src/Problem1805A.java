import java.util.Scanner;

public class Problem1805A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int xor=0;
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                xor ^= arr[i];
            }
            if(n%2==1){
                System.out.println(xor);
            }
            else{
                if(xor==0){
                    System.out.println(xor);
                }
                else{
                    System.out.println(-1);
                }
            }
        }
    }
}
