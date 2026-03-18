import java.util.Scanner;

public class Problem2157B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            String s = sc.next();
            int eight = 0;
            int four=0;
            for(int i=0;i<s.length();i++) {
                if(s.charAt(i)=='8') eight++;
                if(s.charAt(i)=='4') four++;
            }
            //8+8+4>=x+y
            //
        }
    }
}
