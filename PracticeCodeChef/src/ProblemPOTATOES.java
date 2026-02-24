import java.util.Scanner;

public class ProblemPOTATOES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int total = x+y;
            while(true){
                total++;
                boolean isprime = true;
                for(int i = 2; i< total/2 + 1; i++){
                    if(total%i==0){
                        isprime = false;
                    }
                }
                if(isprime) break;
            }
            System.out.println(total - x - y);
        }
    }
}
