import java.util.ArrayList;
import java.util.Scanner;

public class ProblemATM2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            ArrayList<Integer> ar1 = new ArrayList<>();
            ArrayList<Integer> ar2 = new ArrayList<>();
            for(int i=0;i<n;i++){
                int p = sc.nextInt();
                ar1.add(p);
            }
            int i=0;
            while(i<ar1.size()){
                if(ar1.get(i)<=k && k>=0){
                    k-=ar1.get(i);
                    ar2.add(1);
                }
                else{
                    ar2.add(0);
                }
                i++;
            }
            for(i=0;i<n;i++){
                System.out.print(ar2.get(i));
            }
            System.out.println();
        }
    }
}
