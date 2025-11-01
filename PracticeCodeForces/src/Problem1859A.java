import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Problem1859A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int k=0;
            int a = sc.nextInt();
            int[] arra = new int[a];
            ArrayList<Integer> arrb = new ArrayList<>();
            ArrayList<Integer> arrc = new ArrayList<>();
            for (int i = 0; i < a; i++) {
                arra[i] = sc.nextInt();
            }
            Arrays.sort(arra);
            if(arra[0] == arra[a-1]){
                System.out.println(-1);
            }
            else{
                arrc.add(arra[a-1]);
                for(int i=2;i<=a;i++){
                k=arra[a-i];
                    if(k==arra[a-1]){
                    arrc.add(k);
                    }
                    else{
                    arrb.add(k);
                    }
                }
                System.out.print(arrb.size()+" ");
                System.out.println(arrc.size());
                for(int i=0;i<arrb.size();i++){
                    System.out.print(arrb.get(i)+" ");
                }
                System.out.println();
                for(int i=0;i<arrc.size();i++){
                    System.out.print(arrc.get(i)+" ");
                }
            }
        }
    }
}
