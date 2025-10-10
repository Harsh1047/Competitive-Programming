import java.util.Scanner;

public class Problem69A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ax = new int[n];
        int[] ay = new int[n];
        int[] az = new int[n];
        for(int i=0;i<n;i++){
            ax[i] = sc.nextInt();
            ay[i] = sc.nextInt();
            az[i] = sc.nextInt();
        }
        int sumx=0;
        int sumy=0;
        int sumz=0;
        for(int i=0;i<n;i++){
            sumx+=ax[i];
            sumy+=ay[i];
            sumz+=az[i];
        }
        if(sumx==0 && sumy==0 && sumz==0){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
