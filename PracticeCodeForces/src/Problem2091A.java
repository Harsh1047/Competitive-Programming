import java.util.Scanner;

public class Problem2091A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int count1=0,count2=0,count0=0,count3=0,count5=0;int ind=0;
            for(int i=0;i<n;i++){
                ind=i;
                if(arr[i]==0 && count0<3) count0++;
                else if(arr[i]==1 && count1<1) count1++;
                else if(arr[i]==2 && count2<2) count2++;
                else if(arr[i]==3 && count3<1) count3++;
                else if(arr[i]==5 && count5<1) count5++;
                else{
                    break;
                }
            }
            System.out.println(ind+1);
        }
    }
}
