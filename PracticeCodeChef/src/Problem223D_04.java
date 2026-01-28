import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
//            Arrays.sort(arr);
            int count=0;
            boolean[] isvalid = new boolean[102];
            for(int i=0;i<n;i++){
                if(arr[i]==1){
                    count++;
                    isvalid[1] = true;
                }
                else if(arr[i]>1 && isvalid[arr[i]-1]){
                    count++;
                    isvalid[arr[i]]=true;
                }
            }




//            for(int i=0;i<n;i++){
//                if(arr[i]==1) count++;
//            }
//            for(int i=0;i<n;i++){
//                if(arr[i]==1) count++;
//                else {
//                    for (int j = 0; j < i; j++) {
//                        if (arr[j] + 1 == arr[i]) {
//                            count++;
//                            break;
//                        }
//                    }
//                }
//            }
            System.out.println(count);
        }
    }
}
