import java.util.Scanner;

public class Problem2161A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int r = sc.nextInt();
            int x = sc.nextInt();
            int d = sc.nextInt();
            int n = sc.nextInt();
            String s = sc.next();
            if(r==x){
                int i=0;
                for(i=0;i<s.length();i++) if(s.charAt(i)=='1') break;
                System.out.println(s.length()-i);
            }

            else if(r>x){
                int i;
                for(i=0;i<s.length();i++){
                    if(s.charAt(i)=='1') {
                        if(r-d<x && r>0) break;
                    }
                }
                System.out.println(s.length()-i);
            }
            else System.out.println(s.length());

        }
    }
}
