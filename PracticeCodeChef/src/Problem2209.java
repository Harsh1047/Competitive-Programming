import java.util.Scanner;

public class Problem2209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int counteven=0;
            int countodd=0;
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int i=x;i<=y;i++){
                if(i%x==0){
                    if(i%2==0){
                        counteven += i;
                    }
                    else{
                        countodd += i;
                    }
                }
            }
            if(counteven>countodd){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
