import java.util.ArrayList;
import java.util.Scanner;

public class ProblemDELARR7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();int min = Integer.MAX_VALUE;int index=0;int total=0;int s=0;
            ArrayList<Integer> arr = new ArrayList<>();
            ArrayList<Integer> cost = new ArrayList<>();
            for(int i=0;i<n;i++){
                int q = sc.nextInt();
                arr.add(q);
            }
            for(int i=0;i<n;i++){
                int q = sc.nextInt();
                cost.add(q);
            }
            while(arr.size()>0){
                for(int i=0;i<cost.size();i++){
                    if(min>cost.get(i)) min = cost.get(i);
                }
                for(int i=0;i<cost.size();i++) {
                    if (min == cost.get(i)) {
                        index = i;
                        break;
                    }
                }
                for(int i=index;i<arr.size();i++){
                    total+=arr.get(i)*min;
                    s++;
                }
                while(s>0){
                    arr.removeLast();
                    s--;
                }
                cost.remove(index);
                min=Integer.MAX_VALUE;
            }
            System.out.println(total);
        }

    }
}
