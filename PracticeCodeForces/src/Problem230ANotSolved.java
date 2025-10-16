import java.util.Scanner;

public class Problem230ANotSolved {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean iswin = false;
        int s = sc.nextInt();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (n>x){
                n+=y;
                iswin = true;
            }
            else{
                iswin = false;
                break;
            }
        }
        if(iswin){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
