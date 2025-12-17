import java.util.Scanner;

public class ProblemADDPOS {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int sum=0;
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                sum+=arr[i];
            }

            if(sum>=0){
            System.out.println(0);}
            else if(sum%n!=0){
                System.out.println((Math.abs(sum)+n-1)/n);
            }
            else if(n%2==0){
                System.out.println(Math.abs(sum)/n);
            }

        }
    }
}
