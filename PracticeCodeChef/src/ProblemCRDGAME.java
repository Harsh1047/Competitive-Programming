import java.util.Scanner;

public class ProblemCRDGAME {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int chef = 0; int ccount = 0;
            int morty = 0; int mcount = 0;
            for(int i=0;i<n;i++){
                String x = sc.next();
                String s = sc.next();
                for(int j=0;j<x.length();j++) chef += (x.charAt(j) - '0');
                for(int j=0;j<s.length();j++) morty += (s.charAt(j) - '0');
                if(chef>morty) ccount++;
                else if(morty>chef) mcount++;
                else {
                    mcount++;
                    ccount++;
                }
                chef = 0; morty = 0;
            }
            if(mcount>ccount) System.out.println(1 + " " + mcount);
            else if(ccount>mcount) System.out.println(0 + " " + ccount);
            else System.out.println(2 + " " + ccount);
        }
    }
}
