import java.util.Scanner;

public class ProblemHEADBOB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int yes=0,no=0,ind=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='N') no++;
                else if(s.charAt(i)=='Y') yes++;
                else ind++;
            }
            if(ind>0) System.out.println("Indian");
            else if(yes>0 && ind==0) System.out.println("Not Indian");
            else if((yes==0 && no>0)) System.out.println("Not Sure");
        }
    }
}
