import java.util.Scanner;

public class Problem2178A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            boolean is = true;
            int y=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='Y' && y<1) y++;
                else if(s.charAt(i)=='Y') {
                    is = false;
                    break;
                }
            }
            if(is) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
