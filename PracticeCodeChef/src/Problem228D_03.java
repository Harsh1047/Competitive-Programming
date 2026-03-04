import java.util.Scanner;

public class Problem228D_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            int[] ar2 = new int[n];
            StringBuilder sb = new StringBuilder();
            int turns = 0;
            int b=0;
            for(int i=0;i<n;i++){
                if(b>arr[i]) sb.append(arr[i]);
                else {
                    sb.append(turns);
                    b++;
                }
                sb.append(" ");
                if(turns<arr[i]) turns++;

            }
            System.out.println(sb);
//                if(arr[i]<=0){
//                    continue;
//                }
//                else{
//                    arr[i]=0;
//                    for (int j=i+1;j<n;j++) {
//                        if(arr[j]==0) continue;
//                        else ar2[j]++;
//                        arr[j]--;
//
//                    }
//                }
//            }
//            for(int i=0;i<n;i++) System.out.print(ar2[i] + " ");
        }
    }
}
