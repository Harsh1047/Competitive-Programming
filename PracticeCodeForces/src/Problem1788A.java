import java.util.Scanner;

public class Problem1788A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int k=0;
            int count2=0;
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                if(arr[i]==2){
                    count2++;
                }
            }
            if(count2%2 != 0){
                System.out.println(-1);
            }
            else{
                int count=count2/2;
                for(int i=0;i<n;i++){
                    if(arr[i]==2){
                        count--;
                        k=i;
                    }
                    if(count==0){
                        break;
                    }
                }
                System.out.println(k+1);
            }
        }
    }
}
