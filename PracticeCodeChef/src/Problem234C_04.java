import java.util.Scanner;

public class Problem234C_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] hash = new int[500];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                hash[arr[i]]++;
            }
            int count=0;
            for(int i=0;i<=n;i++){
                if(hash[i]==0) continue;
                else if(hash[i]%8 == 0) count+=4;
                else if(hash[i]%4 == 0) count+=2;
                else if(hash[i]%2==0) count+=1;
//                if(hash[i]%2==0) {
//                    while (hash[i] % 2 == 0) {
//                        hash[i] /= 2;
//                        count++;
//                    }
//                }
            }
            System.out.println(count);
        }
    }
}
