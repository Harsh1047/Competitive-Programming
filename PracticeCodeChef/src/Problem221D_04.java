import java.util.Scanner;

public class Problem221D_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Long n = sc.nextLong();
            if(n%2!=0) System.out.println(0);
            else if(n==2 || n==4 || n==6 || n==8) System.out.println(-1);
            else {
                Long copy = n;
                int count=0;
                int total=0; boolean is1 = false;
                int[] hash = new int[10];
                while(copy>0) {
                    int i = Math.toIntExact(copy % 10);
                    hash[i]++;
                    copy /= 10;
                    count++;
                }
                for(int i=1;i<10;i+=2) {
                    if(hash[i]>0) is1 = true;
                }
                if(is1) System.out.println(1);
                else System.out.println(count);
            }
        }
    }
}
