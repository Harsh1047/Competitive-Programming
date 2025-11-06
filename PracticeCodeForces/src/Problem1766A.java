import java.util.ArrayList;
import java.util.Scanner;

public class Problem1766A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Long> round = new ArrayList<>();
        for(long i=0;i<999999;i++){
            if(check(i)){
                round.add(i);
            }
        }
        int t = sc.nextInt();
        while(t-->0) {
            int answer=0;
            long n = sc.nextLong();
            for(int i=0;i<round.size();i++){
                if(round.get(i)<=n){
                    answer++;
                }
                else{
                    break;
                }
            }
            System.out.println(answer);

        }
    }
    private static boolean check(long n) {
        int count = 0;
        int digits=0;
        while (n > 0) {
            if (n % 10 == 0) {
                count++;
            }
            digits++;
            n/=10;
        }
        return digits - count == 1;
    }
}
