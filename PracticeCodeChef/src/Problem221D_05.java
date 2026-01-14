import java.util.Scanner;

public class Problem221D_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long w = sc.nextLong();
            long l = sc.nextLong();
            long r = sc.nextLong();
            long g = sc.nextLong();
            long b = sc.nextLong();
            int count=0;
            if(r>g && g>b){
                if(w>l) {
                    r-=w; count++;
                }
                if(w==r || l==r) count++;
            }
        }
    }
}
