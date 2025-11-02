import java.util.Scanner;

public class Problem1857A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int countOdd = 0;
            int countEven = 0;
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                if(arr[i]%2==0){
                    countEven++;
                }
                else {
                    countOdd++;
                }
            }
            if(countOdd%2 == 0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }

        }
    }
}
