import java.util.Scanner;

public class ProblemSTOPCOUNT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int total=0;
            int ones=0;
            int zeroes = 0;
            for(int i=0;i<s.length();i++){
               // total += Character.getNumericValue(s.charAt(i));
                if(s.charAt(i)=='1') ones++;
                else zeroes++;
                if(ones>zeroes) total++;
            }
            System.out.println(total);
        }
    }
}
