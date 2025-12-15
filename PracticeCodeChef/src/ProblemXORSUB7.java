import javax.print.attribute.HashAttributeSet;
import java.util.HashSet;
import java.util.Scanner;

public class ProblemXORSUB7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int count=0;
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            HashSet<Integer> set = new HashSet<>();
            for(int i=0;i<n;i++){
                set.add(arr[i]);
            }
            Integer[] ar2 = set.toArray(new Integer[0]);
            for(int i=0;i<set.size();i++){
                for(int j=i+1;j<set.size();j++){
                if((ar2[i]^ar2[j]) == Math.abs(ar2[i] - ar2[j])){ count++;
                    System.out.println(ar2[i] + " " + ar2[j]);}
            }
            }
            System.out.println(count);
        }
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            System.out.println(a^b);
    }
}
