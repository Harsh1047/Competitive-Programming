import java.util.Scanner;

public class Problem1881A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            boolean istrue = false;
            int count=0;
            int n = sc.nextInt();
            int m = sc.nextInt();
            String x = sc.next();
            String s = sc.next();
            StringBuilder sb = new StringBuilder(x);
            for(int i=0;i<=5;i++){
                if(sb.toString().contains(s)){
                    istrue = true;
                    break;
                }
                else{
                    count++;
                    sb.append(sb);
                }
            }
            if(istrue){
                System.out.println(count);
            }
            else{
                System.out.println(-1);
            }
        }
    }
}
