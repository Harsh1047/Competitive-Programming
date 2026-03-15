import java.util.Scanner;

public class ProblemPIPSQUIK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            boolean canpass = true;
            int count=0;
            int n = sc.nextInt();
            int h = sc.nextInt();
            int y1 = sc.nextInt(); //duck
            int y2 = sc.nextInt(); //jump
            int l = sc.nextInt(); //life force
            int[] type = new int[n];
            int[] x = new int[n];
            for(int i=0;i<n;i++){
                type[i] = sc.nextInt(); //barrier type
                x[i] = sc.nextInt(); //barrier gap


                if(type[i]==1 && canpass){
                    if(h-y1<=x[i]) count++;
                    else if(l>1){
                        l--;
                        count++;
                    }
                    else canpass = false;
                }
                else if(type[i]==2 && canpass){
                    if(y2>=x[i]) count++;
                    else if(l>1) {
                        l--;
                        count++;
                    }
                    else canpass = false;
                }
            }
            System.out.println(count);
        }
    }
}
